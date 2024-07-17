package com.aditya.programs;

import java.util.ArrayList;
import java.util.Arrays;

public class CountSubstringVowels {
    public static void main(String[] args) {
        String word = "aba";
        System.out.println(countVowels(word));
    }

    private static long countVowels(String s) {
        int n = s.length();
        boolean[] vowels = new boolean[26];
        long count = 0;
        char[] c = s.toCharArray();
        vowels['a'-'a'] = true;
        vowels['e'-'a'] = true;
        vowels['i'-'a'] = true;
        vowels['o'-'a'] = true;
        vowels['u'-'a'] = true;
        System.out.println(Arrays.toString(vowels));

        for (int i = 0; i < n; i++) {
            if (vowels[c[i] - 'a']) {
                count += (long) (i + 1) * (n - i);
            }
        }
        return count;
    }

}
