package com.Aditya.oops.Inheritence;

class Parent{
    String name;
    void method(){
        System.out.println("In Parent Method");
    }
}
class Child extends Parent{
    int id;
    @Override
    void method(){
        System.out.println("In Child Method");
    }
}
public class UpCastingAndDownCasting {
    public static void main(String[] args) {
        // UpCasting
        Parent p = new Child();
        // p.id is not accessible
        p.name = "Abc";
        System.out.println(p.name);
        p.method(); // -> Will Be in Child Method

        // Child c = new Parent(); will give error at compile-time
        // DownCasting Explicitly
        Child c = (Child) p;
        c.id = 1;
        System.out.println(c.id);
        System.out.println(c.name);
        c.method();
    }
}
