package Week1;

public class TypeCasting {
    public static void main(String[] args) {
        //understanding the concept of type casting
        int price = 45;
        double tax = 12.85;
        double fp = price + tax;

        double pp = 5890.75;
        int np = (int) (pp + fp);
        System.out.println(np);

    }
}