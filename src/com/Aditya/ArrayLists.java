package com.Aditya;

import java.util.ArrayList;
import java.util.Scanner;

// Working with Multiple Arraylist
public class ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);
        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // Input
        System.out.println("Multi-Dimension ArrayList Program -");
        System.out.print("Input numbers - ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        // Output
        System.out.println("ArrayList - " + list);
        System.out.println("..End of Program..");
    }
}
