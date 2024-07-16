import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        while (true) {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Convert to Uppercase");
            System.out.println("2. Convert to Lowercase");
            System.out.println("3. Find Length");
            System.out.println("4. Sort Characters");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    // Convert to Uppercase
                    String upper = input.toUpperCase();
                    System.out.println("Uppercase: " + upper);
                    break;
                case 2:
                    // Convert to Lowercase
                    String lower = input.toLowerCase();
                    System.out.println("Lowercase: " + lower);
                    break;
                case 3:
                    // Find Length
                    int length = input.length();
                    System.out.println("Length: " + length);
                    break;
                case 4:
                    // Sort Characters
                    char[] charArray = input.toCharArray();
                    Arrays.sort(charArray);
                    String sorted = new String(charArray);
                    System.out.println("Sorted Characters: " + sorted);
                    break;
                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
