package test;

import test_1.Car;

public class Toyota extends Car {
    @Override
    public int getSeatsNumber() {
        return 2;
        //return super.getSeatsNumber();
    }
}

