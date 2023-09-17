package com.Aditya;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fibonacci Numbers problem -");
        System.out.print("Please enter the term : ");
        int n = in.nextInt();
        System.out.println("Series upto " + n + "th term :-");
        int a = -1, b = 1, temp = 0;
        for (int i = 0; i < n; i++) {
            temp = a + b;
            a = b;
            b = temp;
            System.out.print(temp + "\t");
        }
        System.out.println("\nThe "+ n +"th term = " + temp);
        System.out.println("..End of program..");
    }
}
