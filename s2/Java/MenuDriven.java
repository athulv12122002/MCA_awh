import java.util.Arrays;
import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        // Input 10 elements
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        while (true) {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Display elements");
            System.out.println("2. Sort elements");
            System.out.println("3. Search element");
            System.out.println("4. Sum of elements");
            System.out.println("5. Minimum element");
            System.out.println("6. Maximum element");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Display elements
                    System.out.println("Elements in the array: " + Arrays.toString(arr));
                    break;
                case 2:
                    // Sort elements
                    Arrays.sort(arr);
                    System.out.println("Sorted elements: " + Arrays.toString(arr));
                    break;
                case 3:
                    // Search element
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    int index = Arrays.binarySearch(arr, key);
                    if (index >= 0) {
                        System.out.println("Element found at index: " + index);
                    } else {
                        System.out.println("Element not found");
                    }
                    break;
                case 4:
                    // Sum of elements
                    int sum = 0;
                    for (int num : arr) {
                        sum += num;
                    }
                    System.out.println("Sum of elements: " + sum);
                    break;
                case 5:
                    // Minimum element
                    int min = Arrays.stream(arr).min().getAsInt();
                    System.out.println("Minimum element: " + min);
                    break;
                case 6:
                    // Maximum element
                    int max = Arrays.stream(arr).max().getAsInt();
                    System.out.println("Maximum element: " + max);
                    break;
                case 7:
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
