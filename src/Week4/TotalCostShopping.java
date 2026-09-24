package Week4;

public class TotalCostShopping {

    public static double calculateTotal(double[] arr) {
        double total = 0;
        double final_price = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        if (total > 1000) {
            System.out.println("Total Discount is: " + (total * 20 / 100));
            final_price = total - (total * 20 / 100);
        } else if (total > 600) {
            System.out.println("Total Discount is: " + (total * 10 / 100));
            final_price = total - (total * 10 / 100);
        } else {
            System.out.println("Total Discount is: 0");
            final_price = total;
        }
        return final_price;
    }

    public static void main(String[] args) {
        System.out.println("Final Price After Discount: " + calculateTotal(new double[]{500.0, 300.0, 300.0}));
    }
}