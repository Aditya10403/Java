package com.aditya.programs;

import java.util.Stack;

public class RemoveStars {
    public static void main(String[] args) {
        String s = "erase*****";
        System.out.println(removeStars(s));
    }

    private static String removeStars(String s) {
        if (s.isEmpty()) return "";
        Stack<Character> stk = new Stack<>();
        char[] chars = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        for (char c: chars) {
            if (c >= 'a' && c <= 'z') {
                stk.push(c);
            } else if (c == '*') {
                if (!stk.isEmpty()) stk.pop();
            }
        }
        while (!stk.isEmpty()) ans.append(stk.pop());
        return ans.reverse().toString();
    }
}
