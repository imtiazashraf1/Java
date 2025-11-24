//Task 5 (Challenge): Student Management System and Store details of 3 students.Use an array of objects: Student[] students = new Student[3] and Display all students’ information.
import java.util.Scanner;

class Student {
    String name;
    String id;
    double gpa;

    // Constructor
    Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    // Method to display student info
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("GPA: " + this.gpa);
        System.out.println("-----------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3]; // Array to store 3 students

        // Input student details
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine(); // consume newline

            students[i] = new Student(name, id, gpa); // create Student object
            System.out.println();
        }

        // Display all student information
        System.out.println("All Students Information:");
        for (Student s : students) {
            s.display();
        }
    }
}
