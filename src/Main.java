public class Main {
    public static void main(String[] args) {
        Payment payment1 = new Payment(new CreditCardPayment("1234-5678-4321"));
        payment1.makePayment(100);

        Payment payment2 = new Payment(new PayPalPayment("email"));
        payment2.makePayment(200);

        Payment payment3 = new Payment(new GooglePayPayment("1234567890"));
        payment3.makePayment(300);
    }
}