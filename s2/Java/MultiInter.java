interface printable{
        void print();
}
interface showable{
        void show();
}

class MultiInter implements printable,showable{
        public void print(){
                System.out.println("Hellooo");
        }
        public void show(){
                System.out.println("Welcome.");
        }

        public static void main(String[]args){
                MultiInter obj = new MultiInter();
                obj.print();
                obj.show();
        }
}
