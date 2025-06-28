package com.aditya.Java8.MethodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void printNames(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        MethodReference mr = new MethodReference();
        List<String> names = Arrays.asList("Ram", "Lakshman", "Bharat", "Shatrughan");

        // for static methods
        names.forEach(MethodReference::printNames);

        // for non-static methods
        // names.forEach(mr::printNames);
    }

}
