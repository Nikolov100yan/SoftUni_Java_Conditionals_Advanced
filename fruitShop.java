import java.util.Scanner;

public class fruitShop {
    public static void main(String[] args) {

        // Instance vars
        boolean validInputDay = false, validInputFruit = false, weekend = false;
        String day, fruit;
        double quantity = 0, price = 0, totalPrice = 0;

        // Data input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a fruit type: ");
        fruit = scanner.nextLine();
        System.out.print("Enter a day of the week: ");
        day = scanner.nextLine();
        System.out.print("Enter quantity: ");
        quantity = scanner.nextDouble();

        // Check for valid input
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
            case "Sunday":
               validInputDay = true;
        }
        switch (fruit) {
            case "banana":
            case "apple":
            case "orange":
            case "grapefruit":
            case "kiwi":
            case "pineapple":
            case "grapes":
                validInputFruit = true;
        }

        // Display error in case of invalid input & exit
        if (!validInputDay || !validInputFruit) {
            System.out.println("error");
            System.exit(0);
        }

        // Set conditions for calculation of the total price
        if (day.equals("Saturday") || day.equals("Sunday")) {
            weekend = true;
        }
        if (weekend) {
            switch (fruit) {
                case "banana":
                    price = 2.70;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.90;
                    break;
                case "grapefruit":
                    price = 1.60;
                    break;
                case "kiwi":
                    price = 3.00;
                    break;
                case "pineapple":
                    price = 5.60;
                    break;
                case "grapes":
                    price = 4.20;
                    break;
                }
        }
        else {
            switch (fruit) {
                case "banana":
                    price = 2.50;
                    break;
                case "apple":
                    price = 1.20;
                    break;
                case "orange":
                    price = 0.85;
                    break;
                case "grapefruit":
                    price = 1.45;
                    break;
                case "kiwi":
                     price = 2.70;
                     break;
                case "pineapple":
                    price = 5.50;
                    break;
                case "grapes":
                    price = 3.85;
                    break;
            }

        }

        // Calculate and display the results
        totalPrice = price * quantity;
        System.out.println("*******************");
        System.out.printf("Order: %s x %.2f BGN x %.2f kg%n", fruit, price, quantity);
        System.out.println("*******************");
        System.out.printf("Total: %.2f BGN", totalPrice);
    }
}
