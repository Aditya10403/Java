package com.aditya.OOP.Inheritence.isA_and_hasA;

public class Car {
    private final Engine engine;

    Car() {
        engine = new Engine();
    }

    public void startCar() {
        engine.start();
        System.out.println("Car starts..");
    }
}

