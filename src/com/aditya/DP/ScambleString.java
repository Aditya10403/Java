package com.aditya.DP;

import java.util.HashMap;

public class ScambleString {
    static HashMap<String, Boolean> map = new HashMap<>();
    public static void main(String[] args) {
        String s1 = "great", s2 = "rgeat";
        System.out.println(isScramble(s1, s2));
    }

    private static boolean isScramble(String a, String b) {
        int n = a.length();
        if (a.equals(b)) return true;
        if (n == 1) return false;

        String key = a + " " + b;
        if (map.containsKey(key)) return map.get(key);

        for (int i = 1; i < n; i++) {
            boolean c1 = isScramble(a.substring(0,i), b.substring(n-i)) && isScramble(a.substring(i), b.substring(0, n-i));
            boolean c2 = isScramble(a.substring(0,i), b.substring(0, i)) && isScramble(a.substring(i), b.substring(i));
            if (c1 || c2) {
                map.put(key, true);
                return true;
            }
        }
        map.put(key, false);
        return false;
    }
}
