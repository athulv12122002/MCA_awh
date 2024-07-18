import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private int year;
    private String location;
    private String college;
    private double[] marks; // Assuming an array to store subject marks

    // Constructor to initialize data members
    public Student(int studentId, String name, int year, String location, String college) {
        this.studentId = studentId;
        this.name = name;
        this.year = year;
        this.location = location;
        this.college = college;
        this.marks = new double[5]; // Assuming 5 subjects
    }

    // Method to set subject marks
    public void setMarks(double[] subjectMarks) {
        if (subjectMarks.length == marks.length) {
            System.arraycopy(subjectMarks, 0, marks, 0, marks.length);
        } else {
            System.out.println("Error: Number of subject marks doesn't match.");
        }
    }

    // Method to calculate average marks
    public double calculateAverageMarks() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    // Method to calculate percentage
    public double calculatePercentage() {
        double totalMarks = marks.length * 100; // Assuming each subject is out of 100
        double obtainedMarks = 0;
        for (double mark : marks) {
            obtainedMarks += mark;
        }
        return (obtainedMarks / totalMarks) * 100;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Location: " + location);
        System.out.println("College: " + college);
        System.out.println("Average Marks: " + calculateAverageMarks());
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}

public class Stud_avg_per {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Location: ");
        String location = scanner.nextLine();
        System.out.print("Enter College: ");
        String college = scanner.nextLine();

        // Create a Student object
        Student student = new Student(studentId, name, year, location, college);

        // Input subject marks
        double[] subjectMarks = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextDouble();
        }

        // Set subject marks
        student.setMarks(subjectMarks);

        // Display student details
        System.out.println("\nStudent Details:");
        student.displayDetails();

        scanner.close();
    }
}
