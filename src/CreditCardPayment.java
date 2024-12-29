public class CreditCardPayment implements PaymentStrategy{
    private final String cardNumber;

    public CreditCardPayment(final String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(final double amount) {
        System.out.println("Paying amount " + amount + " using credit-card");
    }
}
