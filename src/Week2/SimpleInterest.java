package Week2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int p= sc.nextInt();
        System.out.print("Enter Rate: ");
        int r= sc.nextInt();
        System.out.print("Enter Time: ");
        int t= sc.nextInt();
        int Si=(p*r*t)/100;
        int FinalAmount= Si + p;
        System.out.println("Simple Interest of Given Data is: "+ Si);
        System.out.println("Total Amount After Interest: "+FinalAmount);
    }
}
