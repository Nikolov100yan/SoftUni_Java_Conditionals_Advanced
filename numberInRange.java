// This script checks if a given number falls within a defined range
import java.util.Scanner;

public class numberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        int number = scanner.nextInt();

        if (-100 <= number && number <= 100 && number != 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
