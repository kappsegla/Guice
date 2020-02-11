import javax.inject.Inject;


public class PaypalCreditCardProcessor implements CreditCardProcessor{

    private final TransactionLog logger;

    @Inject
    public PaypalCreditCardProcessor(TransactionLog logger) {
    this.logger = logger;
    }
}
