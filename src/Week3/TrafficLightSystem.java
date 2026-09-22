package Week3;

import java.util.Scanner;

public class TrafficLightSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter traffic light color: ");
        String val = sc.nextLine().trim().toUpperCase();

        switch (val) {
            case "RED" -> System.out.println("STOP");
            case "YELLOW" -> System.out.println("SLOW DOWN");
            case "GREEN" -> System.out.println("GO");
            default -> System.out.println("Invalid light color");
        }


    }
}