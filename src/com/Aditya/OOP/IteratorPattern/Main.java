package com.Aditya.OOP.IteratorPattern;

public class Main {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator i = nameRepository.getIterator();
        while (i.hasNext()){
            String name = (String) i.next();
            System.out.println("Name : " + name);
        }
    }
}