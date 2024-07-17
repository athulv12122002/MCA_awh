interface Student{
        int score = 10;
        void displayScore();
}
interface Sport{
        int score = 25;
        void displaySport();
}
class Result implements Student,Sport{
        public void displayScore(){
                System.out.println("Academic Score is: " + Student.score);
        }
        public void displaySport(){
                System.out.println("Sport Score is: " + Sport.score);
        }
}
public class StudentResult{
        public static void main(String[]args){
                Result r = new Result();

                r.displayScore();
                r.displaySport();
        }
}
