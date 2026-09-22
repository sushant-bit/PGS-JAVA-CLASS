package Week4;

public class TotalCostShopping {
    public static int calculateTotal(int arr[]) {
        int total = 0;
        int final_price=0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        if(total>=1000 && total>=600){
            System.out.println("Total Discount is: "+total*20/100);
            final_price=total-(total*20)/100;
        }else {
            System.out.println("Total Discount is: "+total*10/100);
            final_price=total-(total*10)/100;
        }

        return final_price;


    }

    public static void main(String[] args) {

        System.out.println("Final Price After Discount: "+calculateTotal(new int[]{200, 302, 43}));
    }
}
