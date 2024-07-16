import java.util.Scanner;

class Product {
    String Pcode;
    String pname;
    double price;

    // Constructor
    Product(String Pcode, String pname, double price) {
        this.Pcode = Pcode;
        this.pname = pname;
        this.price = price;
    }

    // Method to display product details
    void display() {
        System.out.println("Pcode: " + Pcode);
        System.out.println("Pname: " + pname);
        System.out.println("Price: " + price);
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating three Product objects with user input
        Product[] products = new Product[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Pcode: ");
            String Pcode = sc.nextLine();
            System.out.print("Pname: ");
            String pname = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // Consume the newline character
            products[i] = new Product(Pcode, pname, price);
        }

        // Finding the product with the lowest price
        Product lowestPriceProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].price < lowestPriceProduct.price) {
                lowestPriceProduct = products[i];
            }
        }

        // Displaying the product with the lowest price
        System.out.println("\nProduct with the lowest price:");
        lowestPriceProduct.display();

        sc.close();
    }
}
