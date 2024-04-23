import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vars
        int hourExam = 0;
        int minExam = 0;
        int hourArrival = 0;
        int minArrival = 0;
        int sumMinExam = 0;
        int sumMinArrival = 0;
        int difference = 0;
        String arrivalStatus; // "Late", "On time", "Early"

        // Data input
        System.out.print("Hour of exam: ");
        hourExam = scanner.nextInt();
        System.out.print("Minutes of exam: ");
        minExam = scanner.nextInt();
        System.out.print("Hour of arrival: ");
        hourArrival = scanner.nextInt();
        System.out.print("Minutes of arrival: ");
        minArrival = scanner.nextInt();

        // Calculations
        sumMinExam = hourExam * 60 + minExam;
        sumMinArrival = hourArrival * 60 + minArrival;
        difference = sumMinExam - sumMinArrival; // Calculate the difference in minutes
        int hoursF = difference / 60;
        int minF = difference % 60;

        // Conditions
        if (difference < 0) {
            arrivalStatus = "Late";
        } else if (difference <= 30) {
            arrivalStatus = "On time";
        } else {
            arrivalStatus = "Early";
        }

        // Display results
        System.out.println(arrivalStatus);
        if (difference > 1) { // this block consists the cases with status EARLY
            if (difference < 60) {
                System.out.printf("%d minutes before the start%n", difference);
            } else {
                if (minF < 10) {
                    System.out.printf("%d:0%d hours before the start%n", hoursF, minF);
                } else {
                    System.out.printf("%d:%d hours before the start%n", hoursF, minF);
                }
            }
        } else if (difference * (-1) > 1) { // this block consists the cases with status LATE
            difference *= (-1); // Make difference positive for consistent handling
            hoursF *= (-1);
            minF *= (-1);
            if (difference < 60) {
                System.out.printf("%d minutes after the start%n", difference);
            } else {
                if (minF < 10) {
                    System.out.printf("%d:0%d hours after the start%n", hoursF, minF);
                } else {
                    System.out.printf("%d:%d hours after the start%n", hoursF, minF);
                }
            }
        }
    }
}
