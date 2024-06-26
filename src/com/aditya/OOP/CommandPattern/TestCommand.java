package com.aditya.OOP.CommandPattern;

public class TestCommand {
    public static void main(String[] args) {
        // Light ON/OFF
        ReceiverLight light = new ReceiverLight();
        ConcreteLightOn lightOn = new ConcreteLightOn(light);
        ConcreteLightOff lightOff = new ConcreteLightOff(light);

        InvokerSwitch lightSwitch = new  InvokerSwitch(lightOn, lightOff);
        lightSwitch.flipUp();
        lightSwitch.flipDown();

        // Fan ON/OFF
        ReceiverFan fan = new ReceiverFan();
        ConcreteFanOn fanOn = new ConcreteFanOn(fan);
        ConcreteFanOff fanOff = new ConcreteFanOff(fan);

        InvokerSwitch fanSwitch = new InvokerSwitch(fanOn, fanOff);
        fanSwitch.flipUp();
        fanSwitch.flipDown();
    }
}
