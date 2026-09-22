package Week3;

import java.util.Scanner;

public class ATM_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        while (true) {
            System.out.println("Current Balance: Rs. " + balance);
            System.out.print("Enter Amount to Withdraw (0 to exit): ");
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("Thank you for using the ATM.");
                break;
            }

            if (n > balance) {
                System.out.println("Insufficient Balance.");
            } else if (n < 0) {
                System.out.println("Invalid amount.");
            } else {
                balance -= n;
                System.out.println("Withdrawal Successful. Remaining Balance: Rs. " + balance);
            }
            System.out.println();
        }

        sc.close();
    }
}