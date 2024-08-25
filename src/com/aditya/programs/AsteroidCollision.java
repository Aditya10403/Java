package com.aditya.programs;

import java.util.*;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] nums = { -2,2,-1,-2 };
        System.out.println(Arrays.toString(asteroidCollision(nums)));
    }

    private static int[] asteroidCollision(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums;
        Deque<Integer> stack = new ArrayDeque<>();
        int n = nums.length;
        for (int num : nums) {
            if (num > 0 || stack.isEmpty()) stack.push(num);
            else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(num)) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(num)) stack.pop();
                else {
                    if (stack.isEmpty() || stack.peek() < 0) stack.push(num);
                }
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
