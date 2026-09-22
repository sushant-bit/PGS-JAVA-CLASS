package Week5.Constructor;

public class ConstructorExample {
    public static void main(String[] args) {
        Account savingAccount=new Account("SushantAdhikari","326342747243",10023);
        savingAccount.printInfo();

        Account currentAccount=new Account("SushantAdhikari","326342747243",10023);
        currentAccount.printInfo();
    }
}
