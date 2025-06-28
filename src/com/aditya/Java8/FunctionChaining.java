package com.aditya.Java8;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String, String> function1 = s -> s.toUpperCase();
        Function<String, String> function2 = s -> s.substring(0, 4);
//        Function<String, String> addedFunction = function1.andThen(function2);

        System.out.println(function1.andThen(function2).apply("sita ram"));
    }
}
