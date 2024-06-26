package com.aditya.OOP.CommandPattern;

public class InvokerSwitch {
    private Command UpCommand, DownCommand;
    public InvokerSwitch(Command Up, Command Down){
        // Command object registers itself with the invoker.
        UpCommand = Up;
        DownCommand = Down;
    }
    // invoker calls back Command object, which executes the command on receiver.
    void flipUp(){
        UpCommand.execute();
    }
    void flipDown(){
        DownCommand.execute();
    }
}
