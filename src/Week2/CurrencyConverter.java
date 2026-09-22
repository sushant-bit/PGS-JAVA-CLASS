package Week2;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your amount: " );
        int mon=sc.nextInt();
        int finalval=mon*150;
        System.out.println("You amount in USD is: " + finalval);
    }
}
