package com.aditya.programs;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        s = s.trim();
        System.out.println(calculate(s));
    }

    private static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int res = 0, num = 0, sign = 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (int) (ch - '0');
            } else if (ch == '+') {
                res += sign * num;
                sign = 1;
                num = 0;
            } else if (ch == '-') {
                res += sign * num;
                sign = -1;
                num = 0;
            } else if (ch == '(') {
                stack.push(res);
                stack.push(sign);
                sign = 1;
                res = 0;
            } else if (ch == ')') {
                res += sign * num;
                num = 0;
                res *= stack.pop();
                res += stack.pop();
            }
        }
        return num != 0 ? res + sign * num : res;
    }
}
