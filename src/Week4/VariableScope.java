package Week4;

public class VariableScope {

    // 1. Instance Variable (Class Level Scope)
    int b = 10;

    public static void main(String[] args) {
        // 2. Local Variable (Method Level Scope)
        int a = 5;

        // We can only access the instance variable 'b' by creating an object of VariableScope
        VariableScope obj = new VariableScope();

        System.out.println("Local variable a: " + a);
        System.out.println("Instance variable b: " + obj.b);

        // 3. Block Scope
        if (a > 0) {
            int c = 20; // this c is only exist inside the if block.
            System.out.println("Block variable c: " + c);
        }

    }
}