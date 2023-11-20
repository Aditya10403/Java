package com.Aditya.oops.CommandPattern;

public class ConcreteLightOff implements Command{
    private ReceiverLight myLight;
    public ConcreteLightOff(ReceiverLight L){
        myLight = L;
    }
    @Override
    public void execute(){
        myLight.turnOff();
    }
}
