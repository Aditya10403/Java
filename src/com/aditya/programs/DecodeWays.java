package com.aditya.programs;

import java.util.*;

public class DecodeWays {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reversevowels(s));
    }

    private static String reversevowels(String s) {
        char[] c = s.toCharArray();
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            if (set.contains(c[i]) && set.contains(c[j])) {
                char tmp = c[i];
                c[i] = c[j];
                c[j] = tmp;
                j--;
                i++;
            }
            if (set.contains(c[i])) {
                j--;
            } else {
                i++;
            }
        }
        return new String(c);
    }

}
