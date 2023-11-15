package com.Aditya.oops.Interface;
interface Engine{
    void start();
    void acc();
}

interface Brake{
    void brake();
}

interface Media{
    void play();
}

class Bike implements Engine,Brake{

    @Override
    public void start() {
        System.out.println("Bike Started");
    }

    @Override
    public void acc() {
        System.out.println("Bike accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Bike Braking");
    }
}
class Car implements Engine,Brake,Media{

    int a = 10;
    @Override
    public void start() {
        System.out.println("Car Started");
    }

    @Override
    public void acc() {
        System.out.println("Car Accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Car Brake");
    }

    @Override
    public void play() {
        System.out.println("Car Play");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.a);
        car.start();
        car.play();
        Bike bike = new Bike();
        bike.start();
    }
}
