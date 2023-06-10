package com.driver;

public class Vehicle {

    private String name;
    protected int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
     name = "Punch";

    }

    public Vehicle() {

    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        direction = 40;
        currentDirection = direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        currentSpeed  = 20;
        currentDirection = 2;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
          currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

}
