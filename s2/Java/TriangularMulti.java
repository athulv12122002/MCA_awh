import java.util.Scanner;

public class TriangularMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the triangular multiplication table:");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            System.out.print("0 ");
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
