package Week6.abstraction;

public class Account extends AccountRule {
    private String accHolderName;
    private double balance;

    public Account(String accType, String accHolderName, double balance) {
        super(accType); // Passes accType to AccountRule constructor
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    @Override
    public void accountInfo() {
        System.out.println("Account Type: " + accType);
        System.out.println("Account Holder Name: " + accHolderName);
        System.out.println("Balance: " + balance);
    }
}