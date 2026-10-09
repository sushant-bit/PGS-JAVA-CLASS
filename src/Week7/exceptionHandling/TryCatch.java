package Week7.exceptionHandling;

public class TryCatch {
    static void main(String[] args) {
        int num = 100;
        int num2 = 0;
        int[] arr={1,2,3,4};

        try {
            System.out.println(arr[10]);
            System.out.println(num / num2);
        } catch (ArithmeticException e) {
            System.out.println("Exception Occurred = " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Occurred = " + e.getMessage());
        } catch (Exception e){
            System.out.println("Exception Occurred = " + e.getMessage());
        } finally {
            System.out.println("Execution");
        }
    }
}