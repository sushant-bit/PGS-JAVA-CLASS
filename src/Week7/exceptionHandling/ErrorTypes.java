package Week7.exceptionHandling;

public class ErrorTypes {
    public void multiply(int a, int b){
        System.out.println("Result= "+ (a+b)); //LOGICAL ERROR
    }
    static void main(String[] args) {
        int i; // 1. SYNTAX ERROR
        int num = 100;
        int num2 = 0;

        System.out.println(num/num2); //3. Runtime error
        ErrorTypes errorTypes = new ErrorTypes();
        errorTypes.multiply(3,4);
        System.out.println("======= Execution end ========>");

    }
}