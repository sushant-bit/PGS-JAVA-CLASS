package Week6.Polymorphism;

public class MethodOverloadingExample {
    public  void addition(int a,int b){
        System.out.println("Addition :"+(a+b));
    }

    public  void addition(double a,double b){
        System.out.println("Addition :"+(a+b));
    }
    public static void main(String[] args) {
        MethodOverloadingExample m= new MethodOverloadingExample();
        m.addition(10,2);
        m.addition(12.3,3.2);
    }
}
