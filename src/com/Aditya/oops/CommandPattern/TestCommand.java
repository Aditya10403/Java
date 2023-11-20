package com.Aditya.oops.CommandPattern;

public class TestCommand {
    public static void main(String[] args) {
        ReceiverLight light = new ReceiverLight();
        ConcreteLightOn lightOn = new ConcreteLightOn(light);
        ConcreteLightOff lightOff = new ConcreteLightOff(light);

        InvokerSwitch lightSwitch = new  InvokerSwitch(lightOn, lightOff);
        lightSwitch.flipUp();
        lightSwitch.flipDown();

        ReceiverFan fan = new ReceiverFan();
        ConcreteFanOn fanOn = new ConcreteFanOn(fan);
        ConcreteFanOff fanOff = new ConcreteFanOff(fan);

        InvokerSwitch fanSwitch = new InvokerSwitch(fanOn, fanOff);
        fanSwitch.flipUp();
        fanSwitch.flipDown();
    }
}
