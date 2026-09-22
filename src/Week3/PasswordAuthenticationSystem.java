package Week3;

import java.util.Scanner;

public class PasswordAuthenticationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "Lalu";
        int i = 0;
        while (i < 3) {
            System.out.print("Enter Password: ");
            String in = sc.nextLine();
            if (in.equals(password)) {
                System.out.println("Access granted");
                break;
            } else {
                i++;
                if (i < 3) {
                    System.out.println("Incorrect password. Attempts remaining: " + (3 - i));
                }
            }
        }

        if (i == 3) {
            System.out.println("Access denied. Maximum attempts reached.");
        }

    }
}