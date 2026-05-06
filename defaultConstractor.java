import java.awt.*;

class Circle{
    Point center;
    double radius;

    double getPerimeter(){
        return 2*Math.PI*radius;
    }

    double getArea(){
        return Math.PI*radius*radius;
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }
    void setCenter(Point newCenter){
        center = newCenter;
    }
  public static void main(String[] args) {
        Circle c1 = new Circle();//Default Constructor
      c1.radius=5;

      System.out.println(c1.getPerimeter());
      System.out.println(c1.getArea());
  }
}
