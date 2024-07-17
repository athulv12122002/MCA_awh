import java.util.Scanner;
public class TempCovn{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Temperature Menu:\n");
                System.out.println("1.Cel to Fah \n2.Fah to Cel \n");
                System.out.println("Enter your choice (1/2): ");
                int choice = sc.nextInt();

        double temp;

        if (choice == 1){
                System.out.println("Enter the Temperature in Celsius: ");
                temp = sc.nextInt();
                double FahTemp = (temp * 9 / 5) + 32;
                System.out.println("Temp in Fahrenheit: " + FahTemp);
        }
        else if (choice == 2){
                System.out.println("Enter the Temperature in Fahrenheit: ");
                temp = sc.nextInt();
                double CelTemp = (temp - 32) * 5 / 9;
                System.out.println("Temp in Celsius: " + CelTemp);
        }
        else{
                System.out.println("INVALID CHOICE! Please select 1 or 2.");
        }

                sc.close();
        }
}
