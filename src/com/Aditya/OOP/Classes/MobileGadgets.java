package com.Aditya.OOP.Classes;
// Use factory method Design Pattern to create Mobile Gadgets(Mobile,Smart watch,Smart Goggles)

abstract class Mobiles{
    abstract void sound();
}
class Mobile extends Mobiles{
    @Override
    void sound() {
        System.out.println("...la la la...");
    }
}
class Smartwatch extends Mobiles{
    @Override
    void sound(){
        System.out.println("...Beep Beep..");
    }
}
class SmartGoggles extends Mobiles{

    @Override
    void sound() {
        System.out.println("...No sound...");
    }
}
interface MobileFactory{
    Mobiles create(String name);
}
class concreteFactory implements MobileFactory{
    @Override
    public Mobiles create(String name){
        return switch (name) {
            case "Mobile" -> new Mobile();
            case "Smartwatch" -> new Smartwatch();
            case "SmartGoggles" -> new SmartGoggles();
            default -> null;
        };
    }
}
public class MobileGadgets {
    public static void main(String[] args) {
        MobileFactory factory = new concreteFactory();
        Mobiles mobile = factory.create("Mobile");
        Mobiles smartwatch = factory.create("Smartwatch");
        Mobiles smartgoggle = factory.create("SmartGoggles");
        mobile.sound();
        smartwatch.sound();
        smartgoggle.sound();
    }
}
