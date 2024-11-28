package com.aditya.programs;

import java.util.ArrayDeque;
import java.util.Deque;

public class BaseBallGame {
    public static void main(String[] args) {
        String[] ops = { "5","2","C","D","+" };
        System.out.println(calPoints(ops));
    }

    private static int calPoints(String[] ops) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String s: ops) {
            switch (s) {
                case "C" -> {
                    if (!stack.isEmpty()) stack.pop();
                }
                case "D" -> {
                    if (!stack.isEmpty()) {
                        stack.push(2 * stack.peek());
                    }
                }
                case "+" -> {
                    if (stack.size() >= 2) {
                        int top = stack.pop();
                        int newTop = top + stack.peek();
                        stack.push(top);
                        stack.push(newTop);
                    }
                }
                default -> stack.push(Integer.parseInt(s));
            }
        }
        int total = 0;
        for (int score : stack) {
            total += score;
        }
        return total;
    }
}
