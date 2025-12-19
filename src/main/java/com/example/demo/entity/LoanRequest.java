@Entity
public class LoanRequest {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private Double requestedAmount;
    private Integer tenureMonths;
    private String purpose;
    private String status = "PENDING";

    private LocalDateTime appliedAt = LocalDateTime.now();
}
