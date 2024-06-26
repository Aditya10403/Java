package com.aditya.OOP.CommandPattern;

public class ConcreteFanOff implements Command{
    private ReceiverFan myFan;
    public ConcreteFanOff(ReceiverFan F){
        myFan = F;
    }
    @Override
    public void execute() {
        myFan.stopRotate();
    }
}
