package Week6.Question2;


public class Main {

    public static void main(String[] args) {

        Payment p1 = new CreditCard();
        Payment p2 = new PayPal();
        Payment p3 = new ESewa();

        p1.paymentMessage();
        p1.processPayment(2000);

        p2.paymentMessage();
        p2.processPayment(1500);

        p3.paymentMessage();
        p3.processPayment(1000);
    }
}