package com.aditya.programs;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "azxxzy";
        System.out.println(removeDuplicates(s));
    }

    private static String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c: s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);
        }
        if (stack.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for (char c: stack) sb.append(c);
        return sb.reverse().toString();
    }
}
