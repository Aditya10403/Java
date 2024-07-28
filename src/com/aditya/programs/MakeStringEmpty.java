package com.aditya.programs;

import java.util.HashSet;
import java.util.Set;

public class MakeStringEmpty {
    public static void main(String[] args) {
        String s = "aabcbbca"; // ans = abbca    // st = {abc}
        System.out.println(lastNonEmptyString(s));
    }

    private static String lastNonEmptyString(String s) {
        int n = s.length();
        int[] a = new int[26];
        int max = 0;

        for (char c : s.toCharArray()) {
            a[c - 'a']++;
            max = Math.max(a[c - 'a'], max);
        }
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 26; i++) if (a[i] == max) set.add(i);

        StringBuilder ans = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            if (set.contains(s.charAt(i) - 'a')) {
                ans.append(s.charAt(i));
                set.remove(s.charAt(i) - 'a');
            }
            if (set.isEmpty()) break;
        }
        return ans.reverse().toString();
//        int n = s.length();
//        StringBuilder ans = new StringBuilder();
//
//        int i = 0;
//        while (!s.isEmpty()) {
//            ans = new StringBuilder();
//            i = 0;
//            Set<Character> st = new HashSet<>();
//            while (i < s.length()) {
//                if (!st.contains(s.charAt(i))) {
//                    st.add(s.charAt(i));
//                } else {
//                    ans.append(s.charAt(i));
//                }
//                i++;
//            }
//            if (!ans.isEmpty()) {
//                s = ans.toString();
//            } else {
//                break;
//            }
//        }
//
//        return s;
    }
}
