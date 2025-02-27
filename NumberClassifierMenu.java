import java.util.Scanner;

public class NumberClassifierMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\n=== Number Classifier Menu ===\n");
            System.out.println("1. Classify a number as positive, negative, or zero\n");
            System.out.println("2. Print a multiplication table for a given number\n");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();
            System.out.println();

            if (choice == 1) {
                System.out.print("Enter a number to classify: ");
                int number = scanner.nextInt();
                System.out.println(classifyNumber(number));
            } else if (choice == 2) {
                System.out.print("Enter a number to display its multiplication table: ");
                int number = scanner.nextInt();
                System.out.println(getMultiplicationTable(number));
            } else if (choice == 3) {
                System.out.println("Exiting the program. Goodbye!\n");
                break;
            } else {
                System.out.println("Invalid choice! Please enter a number between 1 and 3.\n");
            }

            if (choice != 3) {
                System.out.print("Do you want to return to the menu? (Y/N): ");
                char response = scanner.next().charAt(0);
                System.out.println();
                if (response == 'N' || response == 'n') {
                    System.out.println("Exiting the program. Goodbye!\n");
                    break;
                }
            }
        } while (choice != 3);

        scanner.close();
    }

    // Method to classify a number (returns a String instead of using void)
    public static String classifyNumber(int number) {
        StringBuilder result = new StringBuilder();

        if (number > 0) {
            result.append("The number ").append(number).append(" is positive.\n");
        } else if (number < 0) {
            result.append("The number ").append(number).append(" is negative.\n");
        } else {
            result.append("The number is zero.\n");
        }

        if (number != 0) {
            if (number % 2 == 0) {
                result.append("It is an even number.");
            } else {
                result.append("It is an odd number.");
            }
        }

        return result.toString();
    }

    // Method to return the multiplication table as a String
    public static String getMultiplicationTable(int number) {
        StringBuilder table = new StringBuilder();
        table.append("Multiplication Table for ").append(number).append(":\n");
        
        for (int i = 1; i <= 10; i++) {
            table.append(number).append(" x ").append(i).append(" = ").append(number * i).append("\n");
        }

        return table.toString();
    }
}