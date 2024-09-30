package com.aditya.programs;

import java.util.*;

public class NumberOfAtoms {
    public static void main(String[] args) {
        String formula = "H50";
        System.out.println(countOfAtoms(formula));
    }

    private static String countOfAtoms(String f) {
        if (f.isEmpty()) return "";
        Stack<Map<String, Integer>> stk = new Stack<>();
        Map<String, Integer> map = new HashMap<>();
        int i = 0, n = f.length();
        while (i < n) {
            char c = f.charAt(i++);
            if (c == '(') {
                stk.push(map);
                map = new HashMap<>();
            } else if (c == ')') {
                int val = 0;
                while (i < n && f.charAt(i) >= '0' && f.charAt(i) <= '9') {
                    val = val * 10 + f.charAt(i++) - '0';
                }
                if (val == 0) val = 1;
                if (!stk.isEmpty()) {
                    Map<String, Integer> tmp = map;
                    map = stk.pop();
                    for (String s: tmp.keySet()) {
                        map.put(s, map.getOrDefault(s, 0) + tmp.get(s) * val);
                    }
                }
            } else {
                int start = i - 1, val = 0;
                while (i < n && f.charAt(i) >= 'a' && f.charAt(i) <= 'z') i++;
                String s = f.substring(start, i);
                while (i < n && f.charAt(i) >= '0' && f.charAt(i) <= '9') {
                    val = val * 10 + f.charAt(i++) - '0';
                }
                if (val == 0) val = 1;
                map.put(s, map.getOrDefault(s, 0) + val);
            }
        }
        StringBuilder ans = new StringBuilder();
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for (String s: list) {
            ans.append(s);
            if (map.get(s) > 1) ans.append(map.get(s));
        }
        return ans.toString();
    }
}
