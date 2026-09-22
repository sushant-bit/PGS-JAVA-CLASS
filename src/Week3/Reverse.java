package Week3;

public class Reverse {
    public static void main(String[] args) {
        int num=123;
        int rev=0;
        while (num!=0){
            int las=num%10;
            rev=rev*10+las;
            num=num/10;
        }
        System.out.println(rev);
    }
}
