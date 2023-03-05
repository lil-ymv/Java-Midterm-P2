import java.util.Scanner;
import java.util.ArrayList;

public class CoffeeBuySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOrdering = true;
        ArrayList<Coffee> orders = new ArrayList<>();

        while (isOrdering) {
            System.out.println("What type of coffee would you like? (regular/latte)");
            String type = scanner.nextLine();
            Coffee coffee;
            if (type.equalsIgnoreCase("regular")) {
                coffee = new RegularCoffee();
            } else if (type.equalsIgnoreCase("latte")) {
                coffee = new LatteCoffee();
            } else {
                System.out.println("Invalid coffee type. Please try again.");
                continue;
            }

            System.out.println("Would you like any toppings? (y/n)");
            String response = scanner.nextLine();
            while (response.equalsIgnoreCase("y")) {
                System.out.println("What topping would you like?");
                String topping = scanner.nextLine();
                coffee.addTopping(topping);

                System.out.println("Would you like any more toppings? (y/n)");
                response = scanner.nextLine();
            }

            System.out.println(coffee.toString());
            double total = coffee.calculateTotal();
            System.out.println("Total: $" + String.format("%.2f", total));

            orders.add(coffee);

            System.out.println("Would you like to order another coffee? (y/n)");
            String another = scanner.nextLine();
            if (!another.equalsIgnoreCase("y")) {
                isOrdering = false;
            }
        }

        System.out.println("Your order summary:");
        double grandTotal = 0;
        for (Coffee order : orders) {
            System.out.println(order.toString());
            double total = order.calculateTotal();
            grandTotal += total;
            System.out.println("Total: $" + String.format("%.2f", total));
        }
        System.out.println("Grand Total: $" + String.format("%.2f", grandTotal));
    }
}