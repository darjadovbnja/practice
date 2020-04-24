package test;

import test_1.Car;
public class Main {
    public void userCar(Car car) {
        car.function();
        System.out.println(car.getSeatsNumber());
    }
    public static void main (String[] args) {
        Main main = new Main();
        Car car = new Toyota();
        main.userCar(car);
    }
}


   /*
    void userCar(Car car) {
        car.function();
        System.out.println(car.getSeatsNumber());
    }
    public static void main (String[] args) {
        Main main = new Main();
        Car car = new Toyota();
        main.userCar(car);
    }
}
*/