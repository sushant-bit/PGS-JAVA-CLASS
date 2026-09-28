package Week7;

import java.util.ArrayList;
import java.util.Scanner;

public class GrocceryItems {
     static ArrayList<String> items = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option = -1;

        while (option != 0) {
            System.out.println("\n--- GROCERY MENU ---");
            System.out.println("Enter 1 to Add Items to the list.");
            System.out.println("Enter 2 to Remove Items from the list.");
            System.out.println("Enter 3 to Display all Items.");
            System.out.println("Enter 0 to Exit.");
            System.out.print("Choose an option: ");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    addItems();
                    break;
                case 2:
                    removeItems();
                    break;
                case 3:
                    displayItems();
                    break;
                case 0:
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // 1. Add item
    public static void addItems() {
        System.out.print("Enter item name to add: ");
        String item = sc.nextLine();
        items.add(item);
        System.out.println("'" + item + "' added successfully!");
    }

    // 2. Remove item
    public static void removeItems() {
        if (items.toArray().length==0) {
            System.out.println("The grocery list is currently empty.");
            return;
        }

        System.out.print("Enter item name to remove: ");
        String item = sc.nextLine();

        if (items.remove(item)) {
            System.out.println("'" + item + "' removed successfully!");
        } else {
            System.out.println("Item '" + item + "' not found in the list.");
        }
    }

    // 3. Display all items
    public static void displayItems() {
        if (items.isEmpty()) {
            System.out.println("The grocery list is empty.");
            return;
        }

        System.out.println("\n--- Current Grocery List ---");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }


}