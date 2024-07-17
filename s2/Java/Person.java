class Person {
    String name;
    String gender;
    String address;
    int age;

    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empId;
    String companyName;
    String qualification;
    double salary;

    public Employee(String name, String gender, String address, int age,
                    int empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject;
    String department;
    int teacherId;

    public Teacher(String name, String gender, String address, int age,
                   int empId, String companyName, String qualification, double salary,
                   String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    public void displayDetails() {
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Company: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("-----------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[3];

        teachers[0] = new Teacher("John Doe", "Male", "123 Main St", 35,
                101, "School A", "M.Sc.", 50000,
                "Mathematics", "Science", 1001);
        teachers[1] = new Teacher("Jane Smith", "Female", "456 Elm St", 28,
                102, "School B", "B.Ed.", 45000,
                "English", "Language Arts", 1002);
        teachers[2] = new Teacher("Robert Johnson", "Male", "789 Oak St", 40,
                103, "School C", "Ph.D.", 60000,
                "Physics", "Physical Sciences", 1003);

        for (Teacher teacher : teachers) {
            teacher.displayDetails();
        }
    }
}
