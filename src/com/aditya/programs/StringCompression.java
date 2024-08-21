package com.aditya.programs;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = { 'a','a','b','b','c','c','c' };
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        int idx = 0, count = 0;
        for (int i = 0; i < chars.length; i++) {
            count++;
            if (i + 1 == chars.length || chars[i] != chars[i+1]) {
                chars[idx++] = chars[i];
                if (count != 1) {
                    for (char c: Integer.toString(count).toCharArray()) {
                        chars[idx++] = c;
                    }
                }
                count = 0;
            }
        }
        return idx;
    }

    private static String characters(int num) {
        StringBuilder s = new StringBuilder();
        while (num > 0) {
            int r = num % 10;
            s.append(r);
            num /= 10;
        }
        return s.reverse().toString();
    }
}
