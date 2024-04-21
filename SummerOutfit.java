import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        int degrees = 0;
        String daytime = ""; // potential values: "Morning", "Afternoon", "Evening"
        String outfit = "", shoes = "";

        // Data input
        System.out.print("Enter the degrees: ");
        degrees = scanner.nextInt();
        System.out.print("Enter the daytime: ");
        daytime = scanner.next();

        // Conditions
        if (daytime.equals("Morning")) {
            if (degrees <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (degrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "T-Shirt";
                shoes = "Sandals";
            };
        } else if (daytime.equals("Afternoon")) {
            if (degrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            };
        } else if (daytime.equals("Evening")) {
            outfit = "Shirt";
            shoes = "Moccasins";
        }

        // Display the result
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
