package Week6.Question2;


abstract class Payment {

    abstract void processPayment(double amount);

    void paymentMessage() {
        System.out.println("Processing your payment...");
    }
}