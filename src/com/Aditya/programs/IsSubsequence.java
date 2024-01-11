package com.Aditya.programs;

import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the floor area of the room(m*m)");
        double m = in.nextInt();
        double n = in.nextInt();
        System.out.println("Enter the plant area of a single plant(in cm2)");
        double a = in.nextInt();
        double c = (m * n / a) * 100 * 100;
        int ans = (int) (c / 10) * 10;
        System.out.println("Total plants placed on floor area "
                +String.format("%.2f",m) +" * " +String.format("%.2f",n) +
                " is "+ ans +" plants produces "
                +String.format("%.2f",ans*0.9)  +
                " litres of oxygen in a day");
    }
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        return i == s.length();
    }
}
