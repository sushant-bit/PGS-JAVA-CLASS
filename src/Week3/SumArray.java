package Week3;

public class SumArray {
    public static void main(String[] args) {
        int[] arr={12,32,43,432};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
