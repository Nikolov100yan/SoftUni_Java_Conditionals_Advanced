import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {

        // Vars
        double budget = 0;
        double price = 0;
        String destination; // "Bulgaria", "Balkans", "Europe"
        String season; // "summer", "winter";
        String accommodation = "Camp"; // "Camp", "Hotel"

        // Data entry
        Scanner scanner = new Scanner(System.in);
        System.out.print("Budget: ");
        budget = scanner.nextDouble();
        System.out.print("Season: ");
        season = scanner.next();

        // Conditions
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.30;
                accommodation = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.70;
                accommodation = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.40;
                accommodation = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.80;
                accommodation = "Hotel";
            }
        } else { // budget > 1000
            destination = "Europe";
            price = budget * 0.9;
            accommodation = "Hotel";
        }

        // Display result
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f%n", accommodation, price);
    }
}
