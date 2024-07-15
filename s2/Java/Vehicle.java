import java.util.Scanner;

class Vehicle{
        String manufacture;
        String color;
        int year;
        String model;

        Vehicle(String manufacture,String color,int year,String model){
                this.manufacture = manufacture;
                this.color = color;
                this.year = year;
                this.model = model;
        }
}

class Car extends Vehicle{
        String bodystyle;

        Car(String manufacture,String color,int year,String model,String bodystyle){
                super(manufacture,color,year,model);
                this.bodystyle = bodystyle;
        }
        void display(){
                System.out.println("Manufacturer: "+manufacture);
                System.out.println("Color: "+color);
                System.out.println("Year: "+year);
                System.out.println("Model: "+model);
                System.out.println("Body Style: "+bodystyle);
        }
}

class Vehicles{
        public static void main(String[]args){
                Scanner input = new Scanner(System.in);

                System.out.println("Enter the Number of Cars: ");
                int n = input.nextInt();
input.nextLine();

                Car[] car = new Car[n];

                for (int i=0;i<n;i++){
                        System.out.println("Enter manufacture:");
                        String manufacture = input.nextLine();

                        System.out.println("Enter colour:");
                        String color = input.nextLine();

                        System.out.println("Enter year:");
                        int year = input.nextInt();
                        input.nextLine();

                        System.out.println("Enter model:");
                        String model = input.nextLine();

                        System.out.println("Enter bodystyle:");
                        String bodystyle = input.nextLine();

                        car[i] = new Car(manufacture, color, year, model, bodystyle);
                }

                for (int i=0;i<n;i++){
                        car[i].display();
                }
        }
}
