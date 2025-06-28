package com.aditya.Java8.lamda;

public class Main {
    public static void main(String[] args) {
        Employee employee = () -> "Ram";
        System.out.println(employee.getName());
    }
}
