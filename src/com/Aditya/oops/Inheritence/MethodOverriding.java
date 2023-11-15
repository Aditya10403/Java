package com.Aditya.oops.Inheritence;
class Animal{
    void sound(){
        System.out.println("Sound of Animal, which varies");
    }
    Boolean hasLife(){
        return true;
    }
    Boolean hasTail(){
        return true;
    }
    int noOfEyes(){
        return 2;
    }
    int noOfLegs(){
        return 4;
    }
}
class Dogs extends Animal{
    void sound(){
        System.out.println("Barking...");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.sound();
        System.out.println(d.hasLife());
        System.out.println(d.hasTail());
        System.out.println(d.noOfEyes());
        System.out.println(d.noOfLegs());
    }
}
