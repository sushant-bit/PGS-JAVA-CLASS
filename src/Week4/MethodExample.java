package Week4;

public class MethodExample {

    public static int calculateSquare(int number) {
        return number * number;
    }

    public static void displayWelcomeMessage() {
        System.out.println("Welcome to the Java Method Demonstration!");
    }

    public static String formatFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        displayWelcomeMessage();
        int squareResult = calculateSquare(5);
        System.out.println("Square of 5 is: " + squareResult);

        String fullName = formatFullName("Sushant", "Adhikari");
        System.out.println("Full Name: " + fullName);
    }
}