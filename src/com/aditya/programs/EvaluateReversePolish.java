package com.aditya.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class EvaluateReversePolish {
    public static void main(String[] args) {
        String[] s = { "2","1","+","3","*" };
        System.out.println(evalRPN(s));
    }

    private static int evalRPN(String[] tokens) {
        Set<String> set = new HashSet<>(Arrays.asList("+","-","*","/"));
        Stack<String> stk = new Stack<>();
        for (String c: tokens) {
            if (!set.contains(c)) {
                stk.push(c);
            } else {
                int b = Integer.parseInt(stk.pop());
                int a = Integer.parseInt(stk.pop());
                int ans = eval(a, b, c);
                stk.push(String.valueOf(ans));
            }
        }
        return Integer.parseInt(stk.pop());
    }

    private static int eval(int a, int b, String op) {
        int ans = 0;
        switch (op) {
            case "+" -> ans = a + b;
            case "-" -> ans = a - b;
            case "*" -> ans = a * b;
            case "/" -> ans = a / b;
        }
        return ans;
    }
}
