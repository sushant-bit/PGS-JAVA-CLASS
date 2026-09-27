package Week6.abstraction;

public abstract class AccountRule {
    public String accType;

    // Parameterized constructor to ensure accType is always initialized
    public AccountRule(String accType) {
        this.accType = accType;
    }

    public abstract void accountInfo();

    // Concrete method in abstract class
    public void checkBalance() {
        System.out.println("Checking balance for account type: " + accType);
    }
}