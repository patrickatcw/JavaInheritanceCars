package com.me;
/*Challenge Directions
- start with a base class of a Vehicle, then create a car class that inherits from this base class
- finally, create another class, a specific type of car that inherits from the car class.
- you should be able to hand steering, changing gears, and moving (speed in other words)
- you will want to decide where to put the appropriate state and behaviors (fields and method)
- as mentioned above, changing gears, increasing/decreasing speed should be included
- for your specific type of vehicle you will want to add something specific for that ype of car.
*/

public class Main {

    public static void main(String[] args) {

        Ford ford = new Ford(60);  //creating an instance

        //steer method is coming from vehicle class
        ford.steer(30);       //print result;     Vehicle.steer(): Steering at 30 degrees.
        ford.accelerate(30);          //accelerating 30
        ford.accelerate(20);          //adds 20 to the previous 30
        ford.accelerate(-42);         //slowing down takes us to 1st gear

    }

}
//print results;
/*
Vehicle.steer(): Steering at 30 degrees.
Car.setCurrentGear(): Changed to 3 gear.
Car.changeVelocity(): Velocity 30 direction 30
Vehicle.move(): Moving at 30 in direction 30
Car.setCurrentGear(): Changed to 4 gear.
Car.changeVelocity(): Velocity 50 direction 30
Vehicle.move(): Moving at 50 in direction 30
Car.setCurrentGear(): Changed to 1 gear.
Car.changeVelocity(): Velocity 8 direction 30
Vehicle.move(): Moving at 8 in direction 30
*/