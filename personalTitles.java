import java.util.Scanner;

public class personalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter data
        System.out.print("Enter your age: ");
        double age = scanner.nextDouble();
        System.out.print("Enter your sex: ");
        String sex = scanner.next();

        // Conditions
        if (age >= 16) {
            if (sex.equals("m")) {
                System.out.print("Mr.");
            } else {
                System.out.print("Ms.");
            }
        }
        else {
            if (sex.equals("m")) {
                System.out.println("Master");
            } else {
                System.out.println("Miss");
            }
        }
    }
}
