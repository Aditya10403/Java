package com.Aditya.oops.classes;

// if classes are in different declare public to all.
abstract class Parent{
    // for abstract classes u cannot create objects
    // abstract constructors are also not allowed.
    abstract void career();
    abstract void choice();
}

class Son extends Parent{

    @Override
    void career() {
        System.out.println("I will be a Doctor");
    }

    @Override
    void choice() {
        System.out.println("AIMS");
    }
}

class Daughter extends Parent{

    @Override
    void career() {
        System.out.println("I will be a Engineer");
    }

    @Override
    void choice() {
        System.out.println("IIT");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Son son = new Son();
        son.career();
        son.choice();
        Daughter daughter = new Daughter();
        daughter.career();
        daughter.choice();
    }
}
