package Week7.exceptionHandling;

public class ThrowExample {
    public static void main(String[] args) {
        int age = 15; // Set to under 18 to trigger the exception

        try {
            if (age < 18) {
                // Explicitly throw the exception
                throw new ArithmeticException("Not eligible for voting");
            } else {
                System.out.println("Eligible for voting");
            }
        } catch (ArithmeticException e) {
            // Handle the thrown exception
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}