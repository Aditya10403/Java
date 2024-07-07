package com.aditya.DP;

import java.util.Stack;

public class ParsingBooleanExpression {
    public static void main(String[] args) {
        String expression = "&(|(f))";
        System.out.println(parseBoolExpr(expression));
    }

    private static boolean parseBoolExpr(String expression) {
        Stack<Character> stk = new Stack<Character>();
        for (char c:  expression.toCharArray()) {
            if (c != ')') {
                stk.push(c);
            } else {
                boolean isTrue = false, isFalse = false;
                while (stk.peek() != '(') {
                    char ch = stk.pop();
                    if (ch == 'f') {
                        isFalse = true;
                    } else if (ch == 't') {
                        isTrue = true;
                    }
                }
                stk.pop();
                char symbol = stk.pop();
                if (symbol == '&') {
                    if (isFalse) stk.push('f');
                    else stk.push('t');
                } else if (symbol == '|') {
                    if (isTrue) stk.push('t');
                    else stk.push('f');
                } else {
                    if (isTrue) stk.push('f');
                    else stk.push('t');
                }
            }
        }
        return stk.peek() == 't';
    }
}
