// This script calculates cinema thicket price depending on the day of the week - MODIFIED
import java.util.Scanner;

public class cinemaThicket_ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set instance variables
        String day, movie;
        int ticketNumber = 0, numberAdults = 0, numberChildren = 0, ticketPrice = 0;
        double discount = 0.5, totalPrice = 0;

        // Prompt the user to enter input data
        System.out.print("Movie: ");
        movie = scanner.next();
        System.out.print("Day: ");
        day = scanner.next();
        System.out.print("Tickets for how many adults: ");
        numberChildren = scanner.nextInt();
        System.out.print("Tickets for how many children: ");
        numberAdults = scanner.nextInt();
        scanner.close();

        // Conditions
        switch (day)
        {
            case "Monday":
            case "Tuesday":
            case "Friday":
                ticketPrice = 12;
                break;
            case "Wednesday":
            case "Thursday":
                ticketPrice = 14;
                break;
            case "Saturday":
            case "Sunday":
                ticketPrice = 16;
                break;
        }

        // Calculations
        totalPrice = numberAdults * ticketPrice + numberChildren * ticketPrice * discount;

        // Display the output
        System.out.println("***************************");
        System.out.printf("Movie: %s%n", movie);
        System.out.printf("Tickets for adults: %d%n", numberAdults);
        System.out.printf("Tickets for children: %d%n", numberChildren);
        System.out.println("***************************");
        System.out.printf("Total price: %.2f BGN", totalPrice);
    }
}
