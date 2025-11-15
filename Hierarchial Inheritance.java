// Hierarchial Inheritance

import java.util.Scanner;

class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println("The area of the triangle is "+ 0.5*(l*h));
    }
}

class Circle extends Triangle{
    public void area(int r){
        System.out.println("The area of the circle is "+ 3.1416*r*r);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Shape shape = new Triangle();
        shape.area();

        Triangle triangle = new Circle();

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();   // For triangle
        int h = sc.nextInt();   // For triangle or circle radius

        triangle.area(l, h);    // ✔ Correct method call
    }
}
