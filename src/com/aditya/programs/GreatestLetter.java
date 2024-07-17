package com.aditya.programs;

import java.util.Arrays;

public class GreatestLetter {
    public static void main(String[] args) {
        String s = "lEeTcOdE";
        System.out.println(greatestLetter(s));
    }

    private static String greatestLetter(String s) {
        String lower = "", upper = "";
        for (int i = 'z'; i >= 'a' ; i--) {
            lower = Character.toString(i);
            upper = Character.toString(i - 32);
            if (s.contains(lower) && s.contains(upper)) {
                return upper;
            }
        }
        return "";
    }
}
