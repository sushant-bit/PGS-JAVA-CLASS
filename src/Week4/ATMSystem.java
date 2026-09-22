package Week4;

import java.util.Scanner;

public class ATMSystem {
    public static int balance=45000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isKhatam=false;
        int totalAmount=50000;

        while (!isKhatam){
            System.out.println("Choose an Option: ");
            System.out.println("Enter 1 to Withdraw Amount: ");
            System.out.println("Enter 2 to Deposit Amount: ");
            System.out.println("Enter 3 to Check Amount: ");
            System.out.println("Enter 4 to Exit: ");
            int option= sc.nextInt();
            switch (option){
                case 1->{
                    System.out.println("Enter a Withdraw Amount");
                    int inputAmount= sc.nextInt();
                    withDraw(inputAmount);
                }
                case 2->{
                    System.out.println("Enter a Deposit Amount");
                    int inputAmount= sc.nextInt();
                    depositAmount(inputAmount);
                }
                case 3->{
                    System.out.println("Total Balance is: "+balance);
                }
                case 4->{
                    System.out.println("Exiting......");
                    isKhatam=true;
                }
                default -> System.out.println("Invalid option.");
            }

        }
    }

    public static void withDraw(int withdrawAmount){
        if ((withdrawAmount<=0)){
            System.out.println("Invalid withdraw amount. ");
        }
        else if(withdrawAmount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance-=withdrawAmount;
            System.out.println("Withdraw Successfully. WithDraw Amount is: "+ withdrawAmount);
            System.out.println("Remaining Balance is: "+ balance);
        }
    }

    public static void depositAmount(int depoAmount){
        if ((depoAmount<0)){
            System.out.println("Invalid Deposit amount. ");
        }
        else{
            balance+=depoAmount;
            System.out.println("Deposit Successfully. Deposit Amount is: "+ depoAmount);
            System.out.println("Remaining Balance is: "+ balance);
        }
    }


}
