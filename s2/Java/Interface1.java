interface printable{
void print();
}

class Rect implements printable{
        public void print(){
                System.out.println("Drawing Rectangle...");
        }
}

class Circle implements printable{
        public void print(){
                System.out.println("Printing Circle...");
        }
}

class Interface1{
        public static void main(String[]args){
                Rect r = new Rect();
                Circle c = new Circle();

                r.print();
        }
}
