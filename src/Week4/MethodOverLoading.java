package Week4;

public class MethodOverLoading {
    //polymorphism
    public static void multiple(int a, int b) {
        System.out.println("Multiply: "+ (a*b));
    }
    public static void multiple(int a, int b, int c) {
        System.out.println("Multiply: "+ (a*b*c));
    }
    public static void main(String[] args) {
        multiple(3,4);
        multiple(3,5,8);
    }
}
