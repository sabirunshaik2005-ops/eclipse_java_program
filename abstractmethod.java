package cse;
abstract class Vehicle {
    abstract void start();
    void stop() {
        System.out.println("Vehicle has stopped.");
    }
}
class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key.");
    }
}
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a kick or self-start button.");
    }
}
public class abstractmethod {
public static void main(String[] args) {
	  Vehicle myCar = new Car();
      Vehicle myBike = new Bike();

      myCar.start();
      myCar.stop();

      myBike.start();
      myBike.stop();
}
}
