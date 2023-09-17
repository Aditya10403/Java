package com.Aditya;

import java.util.Arrays;
import java.util.Scanner;

// Ceiling and Floor of Number.
public class SmallestLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] letters = {'c','f','j'};
        System.out.println("Smallest letter grater than target character program -");
        System.out.println("Your Array - " + Arrays.toString(letters));
        System.out.print("Enter a target to search in the above array - ");
        char target = in.next().trim().charAt(0);
        System.out.println("The letter greater than the target is = " + nextGreatestLetter(letters, target));
        System.out.println("..End of Program..");
    }

    //
    static char nextGreatestLetter(char[] letters,char target){
        int start = 0;
        int end = letters.length - 1;
        while (start <= end){
            int middle = start + (end - start) / 2;

            if (target < letters[middle]){
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }
        }
//        return letters[start]; // answer will be at middle + 1
        return letters[start % letters.length];
    }
}
