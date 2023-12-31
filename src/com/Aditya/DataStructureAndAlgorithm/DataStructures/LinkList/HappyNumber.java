package com.Aditya.DataStructureAndAlgorithm.DataStructures.LinkList;

public class HappyNumber {
    public static void main(String[] args) {

    }
    public int sum(int n){
        int ans = 0;
        int r;
        while (n > 0){
            r = n % 10;
            ans += r * r;
            n /= 10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            slow = sum(n);
            fast = sum(sum(n));
        } while (slow != fast);
        return slow == 1;
    }
}
