package com.Aditya.oops.CommandPattern;

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
