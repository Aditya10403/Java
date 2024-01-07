package com.Aditya.programs;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println();
    }
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        return i == s.length();
    }
}
