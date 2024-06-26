package com.aditya.OOP.CommandPattern;

public class ConcreteLightOn implements Command {
    private ReceiverLight myLight;
    public ConcreteLightOn(ReceiverLight L){
        myLight = L;
    }
    @Override
    public void execute() {
        myLight.turnOn();
    }
}
