package Week2;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Marks to Find Grade ");
        int num=sc.nextInt();
        String Grade="";
        if(num>=90 && num<=100){
            Grade="A";
        } else if (num>=80 && num<=89) {
            Grade="B";
        }else if (num>=70 && num<=79) {
            Grade="C";
        }
        else if (num>=60 && num<=69) {
            Grade="D";
        }
        else if (num<60&& num>=0) {
            Grade="F";
        }
        else if(num<0) {
            System.out.println("Number should not be less than 0");
        }
        else {
            System.out.println("Number Should not greater than Hundred");
        }
        System.out.println("Your Grade Is: "+Grade);
    }
}
