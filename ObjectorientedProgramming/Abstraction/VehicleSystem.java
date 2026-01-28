package Abstraction;
interface  Vehicle{
    abstract void start();
   abstract  void stop();
}
class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Start Car ");
    }

    @Override
    public void stop() {
        System.out.println("Stop car ");
    }
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("start bike ");
    }

    @Override
    public void stop() {
        System.out.println("Stop bike ");
    }
}
public class VehicleSystem {
    public static void main(String[] args) {
    Vehicle car = new  Car ();
    car.start();
    car.stop();
    Vehicle bike = new Bike();
    bike.stop();
    bike.start();
    }
}
