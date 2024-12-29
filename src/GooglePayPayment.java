public class GooglePayPayment implements PaymentStrategy{
    private final String phoneNumber;

    public GooglePayPayment(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void pay(final double amount) {
        System.out.println("Paying amount " + amount + " using google pay");
    }
}
