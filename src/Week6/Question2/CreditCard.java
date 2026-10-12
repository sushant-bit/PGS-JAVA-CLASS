package Week6.Question2;


class CreditCard extends Payment {

    @Override
    void processPayment(double amount) {
        System.out.println(
                "Paid Rs. " + amount + " using Credit Card."
        );
    }
}
