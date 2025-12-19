@Service
public class LoanEligibilityServiceImpl implements LoanEligibilityService {

    private final LoanRequestRepository loanRepo;
    private final FinancialProfileRepository profileRepo;
    private final EligibilityResultRepository resultRepo;

    public LoanEligibilityServiceImpl(
            LoanRequestRepository loanRepo,
            FinancialProfileRepository profileRepo,
            EligibilityResultRepository resultRepo) {
        this.loanRepo = loanRepo;
        this.profileRepo = profileRepo;
        this.resultRepo = resultRepo;
    }

    @Override
    public EligibilityResult evaluateEligibility(Long loanRequestId) {

        if (resultRepo.findByLoanRequestId(loanRequestId).isPresent()) {
            throw new BadRequestException("Eligibility already evaluated");
        }

        LoanRequest req = loanRepo.findById(loanRequestId)
                .orElseThrow(() -> new ResourceNotFoundException("Loan request not found"));

        FinancialProfile fp = profileRepo.findByUserId(req.getUser().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Financial profile not found"));

        double obligations = fp.getMonthlyExpenses() + 
            (fp.getExistingLoanEmi() == null ? 0 : fp.getExistingLoanEmi());
        double dti = obligations / fp.getMonthlyIncome();

        EligibilityResult result = new EligibilityResult();
        result.setLoanRequest(req);

        if (fp.getCreditScore() < 600 || dti > 0.6) {
            result.setIsEligible(false);
            result.setRiskLevel("HIGH");
            result.setRejectionReason("High risk");
            result.setMaxEligibleAmount(0.0);
            result.setEstimatedEmi(0.0);
        } else {
            result.setIsEligible(true);
            result.setRiskLevel(dti < 0.3 ? "LOW" : "MEDIUM");
            result.setMaxEligibleAmount(req.getRequestedAmount());
            result.setEstimatedEmi(req.getRequestedAmount() / req.getTenureMonths());
        }

        return resultRepo.save(result);
    }
}
