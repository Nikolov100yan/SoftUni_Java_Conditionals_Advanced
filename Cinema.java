import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        String typeProjection;
        double currentTicketPrice = 0.00, ticketPremiere = 12.00, ticketNormal = 7.50, ticketDiscount = 5.00;
        int rows, columns;

        // Data input
        System.out.print("Enter the type of projection: ");
        typeProjection = scanner.nextLine();
        System.out.print("Enter the number of rows in the cinema hall: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the cinema hall: ");
        columns = scanner.nextInt();

        // Conditions
        if (typeProjection.equals("Premiere")) {
            currentTicketPrice = ticketPremiere;
        } else if (typeProjection.equals("Normal")) {
            currentTicketPrice = ticketNormal;
        } else if (typeProjection.equals("Discount")) {
            currentTicketPrice = ticketDiscount;
        }

        // Calculations
        int capacityCinema = rows * columns;
        double profit = capacityCinema * currentTicketPrice;

        // Display result
        System.out.printf("%.2f leva", profit);
    }
}
