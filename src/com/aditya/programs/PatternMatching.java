package com.aditya.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PatternMatching {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }

    private static boolean wordPattern(String p, String str) {
        HashMap<Character, String> c = new HashMap<>();
        HashMap<String,Character> map = new HashMap<>();
        String[] s = str.split(" ");
        if (s.length != p.length()) return false;

        for (int i = 0 ; i < s.length;i++) {
            if (!c.containsKey(p.charAt(i))) {
                if (map.containsKey(s[i])) {
                    return false;
                } else {
                    c.put(p.charAt(i), s[i]);
                    map.put(s[i], p.charAt(i));
                }
            } else{
                if (!c.get(p.charAt(i)).equals(s[i])) return false;
            }
        }
        return true;
//        Map<Character, String> map = new HashMap<>();
//        String[] s = str.split(" ");
//        if (s.length != p.length()) return false;
//
//        for (int i = 0; i < p.length()/2; i++) {
//            if (map.containsKey(p.charAt(i))){
//                if (!map.get(p.charAt(i)).equals(s[i])) {
//                    return false;
//                }
//            } else if (map.containsValue(s[i])) {
//                if (!map.containsKey(p.charAt(i))) {
//                    return false;
//                }
//            } else {
//                map.put(p.charAt(i), s[i]);
//            }
//        }
//
//        return true;
    }
}
