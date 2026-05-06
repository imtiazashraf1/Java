import java.awt.*;
class Circle{
    Point center;
    double radius;

    Circle(){
        center = new Point(0,0);
        radius = 1;
    }
    Circle(Point initialCenter, double initialRadius){
        center = initialCenter;
        radius = initialRadius;
    }
  public static void main(String[] args) {
      Circle c1 = new Circle();
      System.out.println("Center is " + c1.center);
      System.out.println("Radius is " + c1.radius);


      Circle c2 = new Circle(new Point(3,1), 2);
      System.out.println("Center is " + c2.center);
      System.out.println("Radius is " + c2.radius);
  }

  }



import java.awt.*;
class Circle{
    Point center;
    double radius;

    Circle(){}
    Circle(Point Center, double Radius){
        this.center = Center;
        this.radius = Radius;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Center is " + c1.center);
        System.out.println("Radius is " + c1.radius);


        Circle c2 = new Circle(new Point(3,1), 2);
        System.out.println("Center is " + c2.center);
        System.out.println("Radius is " + c2.radius);
    }

}

import java.awt.*;
class Circle{
    Point center;
    double radius;

    Circle(){}
    Circle(Point Center, double Radius){
        this.center = Center;
        this.radius = Radius;
    }

    double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
    double getArea(){
        return Math.PI*this.radius * this.radius;
    }
    void setCenter(Point Center){
        this.center = Center;
    }
    void setRadius(double Radius){
        this.radius = Radius;
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Center is " + c1.center);
        System.out.println("Radius is " + c1.radius);


        Circle c2 = new Circle(new Point(3,1), 2);
        System.out.println("Center is " + c2.center);
        System.out.println("Radius is " + c2.radius);
    }

