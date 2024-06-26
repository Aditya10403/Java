package com.aditya.programs;

import java.util.Arrays;
import java.util.Comparator;

class item{
    int value, weight;

    public item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

}
class compare implements Comparator<item> {
    @Override
    public int compare(item x, item y) {
        int a = x.value / x.weight;
        int b = y.value / y.weight;
        if (a < b) return 1;
        else if (a > b) return -1;
        else return 0;
    }
}

public class FractionalKnapSack {
    public static int FKS(int wt, item[] nums, int n){
        Arrays.sort(nums, new compare());
        int currWt = 0;
        int res = 0;

        for (int i = 0; i < n; i++) {
            if (currWt + nums[i].weight <= wt) {
                currWt += nums[i].weight;
                res  += nums[i].value;
            } else {
                int diff = wt - currWt;
                res += (nums[i].value / nums[i].weight) * diff;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        item[] nums = {new item(100, 20), new item(60, 10), new item(120, 30)};
        int ans = FKS(50, nums, 3);
        System.out.println("Max = " + ans);
    }
}
