package com.aditya.Java8.lamda;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Employee employee = new Employee() {
            @Override
            public String getName() {
                return "Hanuman";
            }
        };
        System.out.println(employee.getName());
    }

}
