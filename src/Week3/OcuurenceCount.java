package Week3;

public class OcuurenceCount {
    public static void main(String[] args) {
        int[] num={23,3,3,53,43};
        int count=0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]==3){
                count++;
            }
        }
        System.out.println(count);
    }
}
