//Employee Design a class Employee with overloaded constructors to initialize employee data in different ways. Use this keyword properly.
import java.util.Scanner;
class Employee {
    String name;
    String id;
    double salary;
    String post;
    Employee() {
        this.name = "Unknown";
        this.id = "Unknown";
        this.salary = 0.0;
        this.post = "Not Assigned";
    }
    Employee(String name) {
        this();
        this.name = name;
    }
    Employee(String name, String id) {
        this(name);
        this.id = id;
    }

    Employee(String name, String id, double salary, String post) {
        this(name, id);
        this.salary = salary;
        this.post = post;
    }
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("Post: " + this.post);
        System.out.println(" ");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Post: ");
        String post = sc.nextLine();

        Employee e = new Employee(name, id, salary, post);
        e.display();
    }
}
