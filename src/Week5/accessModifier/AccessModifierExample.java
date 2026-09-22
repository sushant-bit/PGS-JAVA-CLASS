package Week5.accessModifier;

// 1. Public -> no restriction
// 2. Protected
// 3. Default
// 4. Private

public class AccessModifierExample {
    public int  balance;

    private  String name;

    // Protected -> accessible within the package
    //accessible outside package class through inheritance only
    protected void displayInfo() {
        System.out.println("Information");
    }
    //default ->
    void printInfo(){
        System.out.println("Information");
    }
}