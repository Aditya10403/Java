package com.aditya.OOP.Classes;
class A{
    A(){
        System.out.println("Grandparent class Constructor");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("Parent class Constructor");
    }
    B(String message){
        this();
        System.out.println("Parent class Constructor with msg : " + message);
    }
}
class C extends B{
    C(){
        this("Hello from Child");
        System.out.println("Child class Constructor");
    }
    C(String message){
        super(message);
        System.out.println("Child class Constructor with msg : " + message);
    }
}
public class ConstructorChaining {
    public static void main(String[] args){
        C child = new C();
    }
}
