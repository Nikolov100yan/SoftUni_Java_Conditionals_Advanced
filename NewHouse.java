import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        // Vars - flower type
        String flowerType; // "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"

        // Vars - prices
        double priceRos = 5.00;
        double priceDah = 3.80;
        double priceTul = 2.80;
        double priceNar = 3.00;
        double priceGla = 2.50;
        double price = 0.00;

        // Vars - discounts
        double discountRos = 0.90; // quantity > 80 Ros
        double discountDah = 0.85; // quantity > 90 Dal
        double discountTul = 0.85; // quantity > 80 Lal
        double discountNar = 1.15; // quantity > 120 Nar
        double discountGla = 1.20; // quantity > 80 Nar
        double discount = 1;
        double totalPrice = 0.00;

        // Vars - other
        int numberFlowers = 0;
        double budget = 0.00;
        double difference = 0.00;
        boolean budgetIsEnough = false;

        // Data input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Flower type: ");
        flowerType = scanner.next();
        System.out.print("Number of flowers: ");
        numberFlowers = scanner.nextInt();
        System.out.print("Budget available: ");
        budget = scanner.nextDouble();
        scanner.close();

        // Check for valid discounts
        if (flowerType.equals("Roses")) {
            price = priceRos;
            if (numberFlowers > 80) {
                discount = discountRos;
            }
        } else if (flowerType.equals("Dahlias")) {
            price = priceDah;
            if (numberFlowers > 90) {
                discount = discountDah;
            }
        } else if (flowerType.equals("Tulips")) {
            price = priceTul;
            if (numberFlowers > 80) {
                discount = discountTul;
            }
        } else if (flowerType.equals("Narcissus")) {
            price = priceNar;
            if (numberFlowers < 120) {
                discount = discountNar;
            }
        } else if (flowerType.equals("Gladiolus")) {
            price = priceGla;
            if (numberFlowers < 80) {
                discount = discountGla;
            }
        }

        // Calculations
        totalPrice = numberFlowers * price * discount;
        difference = budget - totalPrice;

        // Check if the budget is enough
        if (difference >= 0) {
            budgetIsEnough = true;
        } else {
            difference = Math.abs(difference);
        }

        // Display results
        if (budgetIsEnough) {
            System.out.printf("Hey, you have a great garden" +
                    " with %d %s and %.2f leva left.", numberFlowers, flowerType, difference);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }
    }
}
