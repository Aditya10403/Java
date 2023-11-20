package com.Aditya.OOP.CommandPattern;

public class ConcreteFanOn implements Command{
    private ReceiverFan myFan;
    public ConcreteFanOn(ReceiverFan F){
        myFan = F;
    }
    @Override
    public void execute() {
        myFan.startRotate();
    }
}
