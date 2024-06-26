package com.aditya.OOP.FactoryMethodPattern;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new ConcreteFactory();
        Animal dog = factory.create("Dog");
        Animal tiger = factory.create("Tiger");
        Animal cat = factory.create("Cat");
        dog.sound();
        tiger.sound();
        cat.sound();
    }
}
