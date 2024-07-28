package com.aditya.programs;

import java.util.Arrays;

public class ShortName {
    public static void main(String[] args) {
        String s = "Abc Xyz Pqrst";
        System.out.println(shortname(s));
    }

    private static String shortname(String s) {
        if (s == null) return null;
        String[] s2 = s.split(" ");
        StringBuilder resultName = new StringBuilder();
        char firstname = s2[0].charAt(0);
        if (s2.length > 2) {
            char middlename = s2[1].charAt(0);
            return firstname + ". " + middlename + ". " + s2[2];
        }
        return firstname + ". " + s2[2];
    }
}
