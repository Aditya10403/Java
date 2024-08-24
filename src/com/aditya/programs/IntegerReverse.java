package com.aditya.programs;

public class IntegerReverse {
    public static void main(String[] args) {
        int n = 321;
        reverseInteger(n);
    }

    private static void reverseInteger(int n) {
        StringBuilder s = new StringBuilder(String.valueOf(n));
        System.out.println(s.reverse());
    }
}
