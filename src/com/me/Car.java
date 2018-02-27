package com.me;

public class Car extends Vehicle{

    //add fields before extending class above and creating constructor
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    //added constructor
    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear) {
        super(name, size);      //needed to add b/c of super and extends purposes
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = currentGear;
    }

    //create a method for changeGear
    public void changeGear(int currentGear) {   //parameter of currentGear
        this.currentGear = currentGear;     //this is for right here
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    //method for changeVelocity
    public void changeVelocity(int speed, int direction) {  //2 parameters speed, direction
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed, direction);   //calling the move method in vehicle class
    }

}
