package com.moh.app;

import java.util.UUID;

public class Car {

    String make;
    String model;
    int year;
    String vinNumber;

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.vinNumber = UUID.randomUUID().toString();
    }

    public void drive(int speed){
        System.out.println("The car is driving "+speed+" mph.");
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    @Override
    public String toString() {
        return "Car : {" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", vinNumber='" + vinNumber + '\'' +
                '}';
    }
}
