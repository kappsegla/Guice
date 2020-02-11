import javax.inject.Inject;

public class RealBillingService implements BillingService {
    CreditCardProcessor creditCardProcessor;
    TransactionLog transactionLog;

    @Inject
    public RealBillingService(CreditCardProcessor creditCardProcessor, TransactionLog transactionLog) {
        this.creditCardProcessor = creditCardProcessor;
        this.transactionLog = transactionLog;
    }
}
