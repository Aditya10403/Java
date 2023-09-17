package com.Aditya;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Working day or Weekday Problem -");
        System.out.print("Enter the day number : ");
        int day_num = in.nextInt();
        switch (day_num) {
            case 1, 2, 3, 4, 5 -> System.out.println("It's a Working day");
            case 6, 7 ->  System.out.println("It's a Week day");
            default ->  System.out.println("It's not a valid day");
        }
        System.out.println("..End of Program..");
    }
}
