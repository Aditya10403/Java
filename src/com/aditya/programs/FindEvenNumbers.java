package com.aditya.programs;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Find Number of digits which are Even.
public class FindEvenNumbers {
    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896};
        System.out.println("Even Number Digits problem - ");
        System.out.println("Total Even Digits numbers are = " + findNumbers(arr));
        System.out.println("..End of Program..");
    }
    static int findNumbers(int[] arr) {
        int ans = 0;
        for (int num : arr)
            if (even(num)){
                ans++;
            }
        return ans;
    }
    static boolean even(int num){
        int numberDigits = Digits(num);
        return numberDigits % 2 == 0;
    }

    static int Digits(int num){
        if (num < 0) num *= -1;
        return (int)(Math.log10(num)) + 1;
    }
}
