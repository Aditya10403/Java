package com.aditya.programs;

public class ShortestPalindrome {
    public static void main(String[] args) {
        String s = "aacecaaa";
        System.out.println(shortestPalindrome(s));
    }

    /**
     * <pre>   {@code
     * private static String shortestPalindrome(String s) {
     *         int n = s.length();
     *         if (palindrome(s) != null) return s;
     *
     *         StringBuilder sb = new StringBuilder(s).reverse();
     *         int idx = n - 1;
     *         String p = "";
     *         while (idx > 0) {
     *             p = palindrome(s.substring(0, idx));
     *             if (p != null) break;
     *             idx--;
     *         }
     *         return sb.substring(0, n - idx) + s;
     * }
     *
     * private static String palindrome(String s) {
     *      StringBuilder sb = new StringBuilder(s).reverse();
     *      return s.equals(String.valueOf(sb)) ? s : null;
     * }
     * }</pre>
     *
     */


    private static String shortestPalindrome(String s) {
        int n = s.length();
        int idx = 0;
        for (int j = n-1; j >= 0; j--) {
            if (s.charAt(idx) == s.charAt(j)) idx++;
        }
        if (idx == n) return s;
        StringBuilder sb = new StringBuilder(s.substring(idx)).reverse();
        sb.append(shortestPalindrome(s.substring(0, idx))).append(s.substring(idx));
        return sb.toString();
    }
}
