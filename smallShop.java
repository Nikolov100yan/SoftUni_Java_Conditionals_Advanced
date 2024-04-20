// This script calculates the total cost based on the quantity and local price of a product
import java.util.Scanner;

public class smallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Define instance variables
        String product, town;
        double price = 0, output;

        // Prompt the user to enter data
        System.out.print("Product: ");
        product = scanner.next();
        System.out.print("Town: ");
        town = scanner.next();
        System.out.print("Quantity: ");
        double quantity = scanner.nextDouble();
        scanner.close();

        // Conditions
        if (town.equals("Sofia")) {
            switch (product)
            {
                case "coffee":
                    price = 0.50;
                    break;
                case "water":
                    price = 0.80;
                    break;
                case "beer":
                    price = 1.20;
                    break;
                case "sweets":
                    price = 1.45;
                    break;
                case "peanuts":
                    price = 1.60;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
        }
        else if (town.equals("Plovdiv")) {
            switch (product)
            {
                case "coffee":
                    price = 0.40;
                    break;
                case "water":
                    price = 0.70;
                    break;
                case "beer":
                    price = 1.15;
                    break;
                case "sweets":
                    price = 1.30;
                    break;
                case "peanuts":
                    price = 1.50;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
        }
        else if (town.equals("Varna")) {
            switch (product)
            {
                case "coffee":
                    price = 0.45;
                    break;
                case "water":
                    price = 0.70;
                    break;
                case "beer":
                    price = 1.10;
                    break;
                case "sweets":
                    price = 1.35;
                    break;
                case "peanuts":
                    price = 1.55;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
        }
        else {
            System.out.println("Invalid town");;
        }

        // Calculate and display the result
        System.out.println("******************");
        output = quantity * price;
        System.out.println(output);
    }
}
