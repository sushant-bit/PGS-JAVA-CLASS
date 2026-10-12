package Week6.Question2;


class PayPal extends Payment {

    @Override
    void processPayment(double amount) {
        System.out.println(
                "Paid Rs. " + amount + " using PayPal."
        );
    }
}