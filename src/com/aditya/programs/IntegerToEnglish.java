package com.aditya.programs;

public class IntegerToEnglish {
    public static void main(String[] args) {
        int num = 1234567; // One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven
        System.out.println(numberToWords(num));
    }

    private static final String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public static String numberToWords(int num) {
        if (num == 0) return "Zero";
        return helper(num);
    }

    private static String helper(int n) {
        StringBuilder res = new StringBuilder();
        if (n < 20) res.append(ones[n]);
        else if (n < 100) res.append(tens[n / 10]).append(" ").append(ones[n % 10]);
        else if (n < 1000) res.append(helper(n / 100)).append(" Hundred ").append(helper(n % 100));
        else if (n < 1000000) res.append(helper(n / 1000)).append(" Thousand ").append(helper(n % 1000));
        else if (n < 1000000000) res.append(helper(n / 1000000)).append(" Million ").append(helper(n % 1000000));
        else res.append(helper(n / 1000000000)).append(" Billion ").append(helper(n % 1000000000));
        return res.toString().trim();
    }
}
