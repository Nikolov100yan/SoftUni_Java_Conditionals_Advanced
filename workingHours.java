/* This script verified if an office is open or closed
 based on the hour and the day of the week.
 */
import java.util.Scanner;

public class workingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instance variables
        int hour;
        String day;

        // Prompt the user to enter data
        System.out.print("Hour: ");
        hour = scanner.nextInt();
        System.out.print("Day: ");
        day = scanner.next();

        // Set the conditions
        if ((day.equals("Sunday")) || (hour < 10 || hour > 18)) {
            System.out.print("closed");
            }
        else {
            System.out.print("open");
        }

    }
}
