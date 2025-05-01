/*
Problem 1: Vehicle Inheritance Hierarchy
Create a class hierarchy for vehicles. Implement the following structure:
A base class Vehicle with properties like brand, speed, and methods like start() and stop().
A derived class Car that extends Vehicle with additional attributes like fuelType and a method accelerate().
Another derived class Bike that extends Vehicle with an attribute hasGear and a method wheelie().
 */
class Vehicle{
    String brand = "Fortuner";
    int speed = 120;

    void start(){
        System.out.println("To start vehicle");
    }
    void stop(){
        System.out.println("To Stop vehicle");
    }
}
class Car extends Vehicle{
    String fuelType = "Petrol";
    void accelerate(){
        System.out.println("\nAcceleration..");
    }
}
class Bike extends Vehicle{
    String brand = "bullet";    //Overried
    boolean hasGear = true;
    void wheelie(){
        System.out.println("\nFront wheel up!");
    }
}
public class dada2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.accelerate();
        c.start();
        c.stop();
        System.out.println(c.brand);
        System.out.println(c.speed);
        System.out.println(c.fuelType);

        Bike b = new Bike();
        b.wheelie();
        b.start();
        b.stop();
        System.out.println(b.brand);
    }
}