package com.aditya.OOP.Classes;
// Use factory method Design Pattern to create Mobile Gadgets(Mobile,Smart watch,Smart Goggles)

abstract class Mobiles{
    abstract void device();
}
class Mobile extends Mobiles{
    @Override
    void device() {
        System.out.println("Mobile");
    }
}
class Smartwatch extends Mobiles{
    @Override
    void device(){
        System.out.println("Smartwatch");
    }
}
class SmartGoggles extends Mobiles{

    @Override
    void device() {
        System.out.println("Smartgoggles");
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
        mobile.device();
        smartwatch.device();
        smartgoggle.device();
    }
}
