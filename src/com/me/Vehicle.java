package com.me;

public class Vehicle {
    //creating fields
    private String name;    //name of vehicle
    private String size;    //size of vehicle

    private int currentVelocity;    //speed of vehicle
    private int currentDirection;   //direction of vehicle

    //create a constructor
    public Vehicle(String name, String size /*int currentVelocity, int currentDirection*/) {
        this.name = name;
        this.size = size;

        /*this.currentVelocity = currentVelocity;
        this.currentDirection = currentDirection;*/

        this.currentVelocity = 0;   //removed from parameters and added values of 0
        this.currentDirection = 0;
    }

    //add methods
    public void steer(int direction){           //steering method per requirements in directions
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " +
                            currentDirection + " degrees.");
    }

    public void move(int velocity, int direction){      //move method per requirements in directions
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " +
                    currentVelocity + " in direction " + currentDirection);

    }

    //**note: a changing gear method would be in class where required

    //create getters
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    //had to create this method for stopping
    public void stop(){         //method for stopping
        this.currentVelocity = 0;
    }

}
