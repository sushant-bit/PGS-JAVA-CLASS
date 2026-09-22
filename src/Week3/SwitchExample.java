package Week3;

public class SwitchExample {
    public static void main(String[] args) {
        int apiStatus = 200;

        switch (apiStatus) {
            case 200 -> System.out.println("Success.");
            case 500 -> System.out.println("Server error.");
            case 400 -> System.out.println("Bad Request.");
            default -> System.out.println("Invalid status code.");
        }

        String result = switch (apiStatus) {
            case 200 -> "Success";
            case 500 -> "Server error";
            case 400 -> "Bad Request";
            default -> "Unknown Status";
        };

        System.out.println("Result: " + result);
    }
}