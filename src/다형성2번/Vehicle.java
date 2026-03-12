package 다형성2번;

public class Vehicle {
    public void move() {
        System.out.println("차량이 달립니다.");
    }
    public void info() {
        System.out.print("djdjdjdjdjdjddj");
    }
}

class Bus extends Vehicle {
    @Override
    public void move() {
        System.out.println("버스가 달립니다.");
    }
    @Override
    public void info() {
        System.out.print("ffffff");
    }
}

class Taxi extends Vehicle {
    @Override
    public void move() {
        System.out.println("택시가 달립니다.");
    }
}

class SportCar extends Vehicle {
    @Override
    public void move() {
        System.out.println("스포츠카가 달립니다.");
    }
}

class Driver {
    String name;
    public Driver(String name) {
        this.name = name;
    }

//    void drive(Vehicle vehicle) {
//        System.out.print(name + "의 ");
//        vehicle.move();
//        vehicle.info();
//    }
    void drive(Bus bus) {

    }
    void drive(Taxi taxi) {

    }
    void drive(SportCar sportCar) {

    }
}
