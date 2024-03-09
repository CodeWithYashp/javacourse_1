package com.example.assignment;

class Vehicle{
    int speed;
    String color;
    void move(){
        System.out.println("Vehicle is moving with speed "+ speed + " km/hr and the color of the vehicle is " + color);
    }
}

class Car extends Vehicle{
    @Override
    public void move(){
        System.out.println("Car is moving with speed " + speed + " km/hr and the color of the vehicle is " + color);
    }
}
public class Assignment1 {
    public static void main(String[] args){
        Vehicle myVehicle = new Vehicle();
        myVehicle.speed = 123;
        myVehicle.color = "red";
        myVehicle.move();
        Car myCar = new Car();
        myCar.speed = 200;
        myCar.color = "yellow";
        myCar.move();
    }
}
