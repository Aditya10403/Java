package com.aditya.Java8;

import java.util.function.Consumer;

public class ConsumerSupplier {
    public static void main(String[] args) {
        Consumer<String> consumer1 = s -> System.out.println(s);
        Consumer<String> consumer2 = s -> System.out.println(s);
        consumer1.andThen(consumer2).accept("Hanuman");
    }
}
