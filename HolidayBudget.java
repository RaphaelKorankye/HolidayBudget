import java.util.Scanner;

public class HolidayBudget {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("WELCOME TO THE HOLIDAY SHOPPING PLANNER!");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your holiday budget: $");
        double budget = input.nextDouble();

        double total = 0;
        int giftCount = 0;

        System.out.print("How many shopping days? ");
        int days = input.nextInt();
        input.nextLine();

        // Outer loop: repeats for each shopping day
        for (int day = 1; day <= days; day++) {

            System.out.println("\nShopping Day " + day);

            String choice = "yes";

            // Inner loop: adds multiple gifts each day
            while (choice.equalsIgnoreCase("yes")) {

                System.out.print("Enter the gift name: ");
                String gift = input.nextLine();

                System.out.print("Enter the gift price: $");
                double price = input.nextDouble();
                input.nextLine();

                if (price > 0) {
                    total += price;
                    giftCount++;

                    System.out.println(gift + " added successfully!");

                    if (total > budget) {
                        System.out.println("Warning! Over budget!");
                    } else {
                        System.out.println("You are within budget!");
                    }

                } else {
                    System.out.println("Invalid price! Gift not added.");
                }

                System.out.print("Add another gift today? (yes/no): ");
                choice = input.nextLine();
            }
        }

        double remaining = budget - total;

        System.out.println("\n===== HOLIDAY SHOPPING REPORT =====");
        System.out.println("Shopper: " + name.toUpperCase());
        System.out.println("Number of gifts: " + giftCount);
        System.out.printf("Budget: $%.2f%n", budget);
        System.out.printf("Total spending: $%.2f%n", total);
        System.out.printf("Money remaining: $%.2f%n", remaining);

        if (total <= budget) {
            System.out.println("Great job! You stayed within budget!");
        } else {
            System.out.println("You exceeded your holiday budget!");
        }

        input.close();
    }
}