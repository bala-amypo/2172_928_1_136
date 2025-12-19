@Entity
public class RiskAssessmentLog {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long loanRequestId;
    private Double dtiRatio;
    private String creditCheckStatus;

    private LocalDateTime timestamp = LocalDateTime.now();
}
