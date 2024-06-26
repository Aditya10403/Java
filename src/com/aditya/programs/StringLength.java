package com.aditya.programs;

import java.util.Set;
import java.util.TreeSet;

public class StringLength {
    public static void main(String[] args) {
        String s = "Beautiful flowers bloom brightly under the summer sky";
        String[] arr = s.split(" ");
        Set<String> set = new TreeSet<>((str1, str2) -> {
            int count1 = countVowels(str1);
            int count2 = countVowels(str2);
            if (count1 == count2) {
                return str1.compareTo(str2);
            }
            return Integer.compare(count1, count2);
        });
        for (String str : arr) {
            if (str.length() <= 5) continue;
            else set.add(str);
        }
        for (String str : set) {
            System.out.print(str + " ");
        }
    }
    private static int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (isVowel(c)) count++;
        }
        return count;
    }
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
