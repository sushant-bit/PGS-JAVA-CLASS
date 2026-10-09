package Week7.lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        numbers.removeIf(x->x%2==0);
        System.out.println(numbers);

        Calculation calculation =(int a, int b)-> System.out.println("Result: "+(a+b));
        calculation.calc(10,20);
    }
}
