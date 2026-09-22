package Week3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to find Prime or Not: ");
        int n= sc.nextInt();
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }else {
            if (n==2) {
                isPrime=true;

            }else {
            for (int i = 2; i <n ; i++) {
                if (n%i==0){
                    isPrime=false;
                    break;
                }
            }}
        }

        if (isPrime){
            System.out.println("It is a Prime Number.");
        }else {
            System.out.println("It is not a Prime Number");
        }
    }
}
