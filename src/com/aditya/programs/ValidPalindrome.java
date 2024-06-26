package com.aditya.programs;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder newstring = new StringBuilder();
        for (int k = 0; k < s.length(); k++) {
            if (Character.isLetter(s.charAt(k)) || Character.isDigit(s.charAt(k))){
                newstring.append(s.charAt(k));
            }
        }
        int i = 0;
        int j = newstring.length() - 1;
        while (i < j){
            if (newstring.charAt(i) == newstring.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
