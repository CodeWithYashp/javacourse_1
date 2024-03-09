package com.example.car;

public class Car {
    private String name;
    private String model;

    public Car(String name, String model){
        this.name = name;
        this.model = model;
    }

    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Model: " + this.model);
    }
}
