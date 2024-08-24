package com.aditya.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CloseStrings {
    public static void main(String[] args) {
        System.out.println(closeStrings("abc", "bca"));
    }

    public static boolean closeStrings(String word1, String word2) {
        if (word2.length() > word1.length()) return false;
        Set<Character> set = new HashSet<>();
        int[] w1 = new int[26];
        int[] w2 = new int[26];
        for (char c: word1.toCharArray()) {
            w1[c - 'a']++;
            set.add(c);
        }
        for (char c: word2.toCharArray()) {
            w2[c - 'a']++;
            set.remove(c);
        }
        Arrays.sort(w1);
        Arrays.sort(w2);
        return Arrays.equals(w1, w2) && set.isEmpty();
    }
}
