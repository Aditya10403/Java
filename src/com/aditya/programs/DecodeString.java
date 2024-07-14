package com.aditya.programs;


import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c != ']') {
                stack.push(c);
            } else {
                StringBuilder tmp = new StringBuilder();
                while (!stack.isEmpty() && Character.isLetter(stack.peek()))
                    tmp.insert(0, stack.pop());

                String sub = tmp.toString();
                stack.pop();

                tmp = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek()))
                    tmp.insert(0, stack.pop());

                int cnt = Integer.parseInt(tmp.toString());

                while (cnt > 0) {
                    for (char ch : sub.toCharArray()) stack.push(ch);
                    cnt--;
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) ans.insert(0, stack.pop());
        return ans.toString();
    }
}
