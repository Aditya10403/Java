package com.aditya.programs;

import java.util.*;

public class MaxVowelSubstring {
    public static void main(String[] args){
        String s = "abciiidef";
        System.out.println(maxVowels(s, 3));
    }

    public static int maxVowels(String s, int k) {
        int n = s.length();
        int maxLen = Integer.MIN_VALUE, vc = 0;
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            deque.offerLast(s.charAt(i));
            if (set.contains(s.charAt(i))) vc++;
            if (deque.size() == k) {
                char c = deque.pollFirst();
                maxLen = Math.max(maxLen, vc);
                if (set.contains(c)) vc--;
            }
        }
        return maxLen;
    }
}
