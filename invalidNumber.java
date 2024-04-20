import java.util.Scanner;

public class invalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 100 || number > 200) {
            if (number != 0) {
                System.out.println("invalid");
            }
        }

    }
}
