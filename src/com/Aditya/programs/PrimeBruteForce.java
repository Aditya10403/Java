package com.Aditya.programs;

import java.util.Scanner;

public class PrimeBruteForce {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int start = in.nextInt();
        int end = in.nextInt();
        int sum=0;
        int temp;
        boolean flag;
        for(int i=start; i<=end; i++) {
            if(i<0) {
                temp=-(i);
            } else{
                temp=i;
            }
            flag= temp >= 2;
            for(int j=2; j <Math.sqrt(temp); j++) {
                if(i%j == 0) {
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.print(i + " ");
                sum+=i;
            }
        }
        System.out.println("Sum = " + sum);
    }

}
