import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vars
        String season;
        int budget = 0, numFishermen = 0;
        double price = 0, difference = 0;

        // Data entry
        System.out.print("Budget: ");
        budget = scanner.nextInt();
        System.out.print("Season: ");
        season = scanner.next();
        System.out.print("Number of fishermen: ");
        numFishermen = scanner.nextInt();

        // Conditions
        if (season.equals("Spring")) {
            price = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            price = 4200;
        } else { // season = "Winter"
            price = 2600;
        }

        if (numFishermen <= 6) {
            price *= 0.9;
        } else if (numFishermen <= 11) {
            price *= 0.85;
        } else { // numFishermen > 12
            price *= 0.75;
        }

        if ((numFishermen % 2 == 0) && !season.equals("Autumn")) {
            price *= 0.95;
        }

        // Calculations
        difference = budget - price;

        // Display the results
        if (difference > 0) {
            System.out.printf("Yes! You have %.2f leva left.%n", difference);
        } else {
            difference *= (-1);
            System.out.printf("Not enough money! You need %.2f leva.%n", difference);
        }
    }
}
