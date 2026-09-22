package Week3;

import java.util.Scanner;

public class LoopExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("For Loop:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("While Loop:");
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }

        System.out.println("Do-While Loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= n);


    }
}