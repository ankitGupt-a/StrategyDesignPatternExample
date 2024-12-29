public class PayPalPayment implements PaymentStrategy{
    private final String email;

    public PayPalPayment(final String email) {
        this.email = email;
    }

    public void pay(final double amount) {
        System.out.println("Paying amount " + amount + " using Paypal");
    }
}
