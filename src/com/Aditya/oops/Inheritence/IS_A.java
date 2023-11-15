package com.Aditya.oops.Inheritence;

class Dog{
    Boolean hasLife = true;
    void eat(){
        System.out.println("Eating...");
    }
}

class GermanShephard extends Dog{
    void sound(){
        System.out.println("Barking...");
    }
}
public class IS_A {
    public static void main(String[] args) {
        GermanShephard d = new GermanShephard();
        System.out.println("Has Life -> " + d.hasLife);
        d.eat();
        d.sound();
    }
}
