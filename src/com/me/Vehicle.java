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
}
