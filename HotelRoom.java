import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vars
        String month; // "May", "June", "July", "August", "September", "October"
        String accommodation; // "Apartment", "Studio"
        int numberNights = 0;
        double totalCostStudio = 0;
        double totalCostApartment = 0;
        double priceStudio = 0;
        double priceApartment = 0;

        // Data input
        System.out.print("Month: ");
        month = scanner.next();
        System.out.print("Number of nights: ");
        numberNights = scanner.nextInt();

        // Conditions
        if (month.equals("May") || month.equals("October")) {
            if (numberNights > 14) {
                priceStudio = 50 * 0.7;
                priceApartment = 65 * 0.9;
            } else if (numberNights > 7) {
                priceStudio = 50 * 0.95;
                priceApartment = 65;
            } else {
                priceStudio = 50;
                priceApartment = 65;
            }
        } else if (month.equals("June") || month.equals("September")) {
            if (numberNights > 14) {
                priceStudio = 75.20 * 0.8;
                priceApartment = 68.70 * 0.9;
            } else {
                priceStudio = 75.20;
                priceApartment = 68.70;
            }
        } else if (month.equals("July") || month.equals("August")) {
            priceStudio = 76;
            if (numberNights > 14) {
                priceApartment = 77 * 0.9;
            } else {
                priceApartment = 77;
            }
        }

        // Calculations
        totalCostStudio = numberNights * priceStudio;
        totalCostApartment = numberNights * priceApartment;

        // Display results
        System.out.printf("Apartment: %.2f lv.%n", totalCostApartment);
        System.out.printf("Studio: %.2f lv.%n", totalCostStudio);
    }
}
