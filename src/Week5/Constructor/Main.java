package Week5.Constructor;

public class Main {
    public static void main(String[] args) {
        Account savingAccount = new Account("Sushant Adhikari", "326342747243", 10023.00);
        Account currentAccount = new Account("Manoj Adhikari", "987654321012", 50000.50);

        System.out.println(" SAVINGS ACCOUNT ");
        savingAccount.printInfo();

        System.out.println(" CURRENT ACCOUNT ");
        currentAccount.printInfo();
    }
}