public class Payment {
    private final PaymentStrategy paymentStrategy;

    public Payment(final PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(final double amount) {
        if (paymentStrategy==null) {
            System.out.println("Please provide payment method");
            return;
        }

        paymentStrategy.pay(amount);
    }
}
