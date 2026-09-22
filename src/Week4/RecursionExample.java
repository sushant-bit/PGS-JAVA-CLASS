package Week4;

public class RecursionExample {

    public static int factorial(int k){
        int fact=1;
        if(k<=0){
          return 0;
        }
        else {
             for (int i = 2; i <=k ; i++) {
            fact*=i;
        }

        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
