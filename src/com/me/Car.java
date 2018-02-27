package com.me;

public class Car {

    //add fields before extending class above and creating constructor
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    //added constructor
    public Car(int wheels, int doors, int gears, boolean isManual, int currentGear) {
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = currentGear;
    }
}
