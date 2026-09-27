package Week6.abstraction;

public class Main {
    public static void main(String[] args) {
        AccountRule savingAccount = new Account("Savings", "Sushant Adhikari", 7874);
        savingAccount.accountInfo();
        savingAccount.checkBalance();

        System.out.println("-------------------");

        AccountRule currentAcc = new Account("Current", "Parajuli", 445743872);
        currentAcc.accountInfo();
        currentAcc.checkBalance();
    }
}