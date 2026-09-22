package Week3;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr={1,24,353,345,3,4,0,-2};
        int max= arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }else if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("MinVal: "+min);
        System.out.println("MaxVal: "+max);
    }
}
