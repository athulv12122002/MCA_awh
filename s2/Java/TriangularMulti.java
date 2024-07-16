import java.util.Scanner;
public class TriMul{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number of Rows for the Triangular Multiplication Table: ");
                int rows = sc.nextInt();
                System.out.println("The Triangular Multiplication table of " +rows +" is: ");
                for(int i=0;i<rows;i++){
                        System.out.print("");
                        for(int j=0;j<=i;j++){
                                System.out.print(i * j + " ");
                        }
                        System.out.println();
                }
        }
}
