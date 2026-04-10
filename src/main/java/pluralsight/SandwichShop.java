package pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // establishing sandwich size
        double sandwichPrice = 0.00;
        System.out.print("What sandwich size do you want? (1 or 2)\n" +
                "1: Regular: base price $5.45\n" +
                "2: Large: base price $8.95\n");
        int sandwichSize = scanner.nextInt();
        scanner.nextLine();

        // establishing sandwich price
        if (sandwichSize == 1) {
            sandwichPrice = 5.45;
        } else if (sandwichSize == 2) {
            sandwichPrice = 8.95;
        } else {
            System.out.println("Invalid size try again.");
            return;
        }

        // establishing if sandwich is loaded
        boolean loaded = false;
        double loadedPrice = 0;
        System.out.println("Would you like your sandwich loaded? (Y/N");
        String sandwichLoaded = scanner.nextLine();
        if (sandwichLoaded.equals("Y")) {
            loaded = true;
        } else if (sandwichLoaded.equals("N")) {
            loaded = false;
        } else {
            System.out.println("Invalid choice try again");
            return;
        }

        // establishing loaded price
        if (loaded) {
            if (sandwichSize == 1) {
                loadedPrice = 1.00;
            } else {
                loadedPrice = 1.75;
            }
        }

        // establishing age
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        // final result
        if (age <= 17) {
            System.out.println("Your sandwich will be: $" + String.format("%.2f", (sandwichPrice + loadedPrice) * 0.90));
        } else if (age >= 65) {
            System.out.println("Your sandwich will be: $" + String.format("%.2f", (sandwichPrice + loadedPrice) * 0.80));
        } else {
            System.out.println("Your sandwich will be: $" + String.format("%.2f", (sandwichPrice + loadedPrice)));
        }
    }
}
