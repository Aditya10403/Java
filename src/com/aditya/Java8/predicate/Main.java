package com.aditya.Java8.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;

        Predicate<String> startsWithA = s -> s.toLowerCase().charAt(0) == 'r';
        Predicate<String> endsWithM = s -> s.toLowerCase().charAt(s.length() - 1) == 'm';
        Predicate<String> startsAndEndWithAM = startsWithA.and(endsWithM);

        List<Integer> list = new ArrayList<>(Arrays.asList(
                13, 34, 45, 96, 5, 6
        ));
        List<String> names = new ArrayList<>(Arrays.asList(
                "sita", "ram", "lakshman", "hanuman", "aditya"
        ));

//        startsWithA.negate("name");

        for (int num: list) {
            if (isEven.test(num)) System.out.print(num + " ");
        }
        System.out.println();
        for (String str: names) {
            if (startsWithA.test(str)) System.out.print(str + " ");
        }
        System.out.println();
        for (String str: names) {
            if (startsAndEndWithAM.test(str)) System.out.print(str + " ");
        }
    }
}
