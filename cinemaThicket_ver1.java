// This script calculates cinema thicket price depending on the day of the week
import java.util.Scanner;

public class cinemaThicket_ver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set instance variables
        String day;
        int thicketPrice = 0;

        // Prompt the user to enter input data
        System.out.print("Day: ");
        day = scanner.next();
        scanner.close();

        // Conditions
        switch (day)
        {
            case "Monday":
            case "Tuesday":
            case "Friday":
                thicketPrice = 12;
                break;
            case "Wednesday":
            case "Thursday":
                thicketPrice = 14;
                break;
            case "Saturday":
            case "Sunday":
                thicketPrice = 16;
                break;
        }

        // Display the output
        System.out.println(thicketPrice);
    }
}
