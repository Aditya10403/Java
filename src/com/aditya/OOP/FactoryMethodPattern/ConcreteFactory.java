package com.aditya.OOP.FactoryMethodPattern;

public class ConcreteFactory implements AnimalFactory{
    @Override
    public Animal create(String name) {
        return switch (name) {
            case "Dog" -> new Dog();
            case "Tiger" -> new Tiger();
            case "Cat" -> new Cat();
            default -> null;
        };
    }
}
