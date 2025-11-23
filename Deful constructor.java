//Task 1: Car Class Create a class Car with: • Fields: brand, model, year • Methods: displayDetails() • Constructors: default & parameterized
class Car{
    String brand;
    String model;
    int year;

    Car(){
        brand="Toyota";
        model="Corolla";
        year=2022;
    }
    Car(String brand,String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    void displayDetails(){
        System.out.println("Car:" + brand +" " + model +"("+year+")");

    }
}
public class Main{
    public static void main(String[] args){

        Car c1=new Car();
        c1.displayDetails();
        Car c2=new Car("Tesla","Model 3",2004);
        c2.displayDetails();


    }
}
