package Week5.Constructor;

public class Account {
    public String accountHolderName;
    public  String accountNumber;
    public double balance;

    //constructor
    //1. constructor name is same as class name
    //2. constructor  does not have any return type
    //3. constructs objects\\

    //default constructor
//    public Account(){
//
//    }

    //parameterized constructor

    public Account(String accountHolderName,String accountNumber,double balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void printInfo(){
        System.out.println("Account holder Name: "+ accountHolderName);
        System.out.println("Account Number : "+ accountNumber);
        System.out.println("Account Balance: "+ balance);
    }
}
