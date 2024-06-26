package com.aditya.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class BruteForceSubArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int i,j, sum=0;
        String[] input = in.nextLine().split(" ");
        for (i = 0; i < input.length; i++) {
            list.add(Integer.parseInt(input[i]));
        }
        for (i = 0; i < list.size()-1; i++) {
            sum = 0;
            for (j = i; j < list.size(); j++) {
                if (list.get(j) % 2 != 0) {
                    sum+=list.get(j);
                }
                System.out.print(list.get(j) + " ");
            }
            System.out.println("=> " + sum);
        }
    }
    public static ArrayList<Integer> Leaders(int[] nums, int n){
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag;
        int i,j;
        for (i = 0; i < n-1; i++) {
            flag=true;
            for (j = i+1; j < n; j++) {
                if (nums[j]>nums[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(i);
            }
        }
        list.add(nums[n-1]);
        return list;
    }


}
