// This script distinguish between fruits and vegetables
import java.util.Scanner;

public class fruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter an item
        System.out.print("Enter your querry: ");
        String item = scanner.nextLine();
        scanner.close();

        // Set conditions
        switch (item)
        {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.print("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.print("vegetable");
                break;
            default:
                System.out.print("unknown");
                break;
        }
    }
}
