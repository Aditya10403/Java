package com.aditya.programs;

import java.util.*;

public class RandomizedCollection {
    List<Integer> nums;
    Map<Integer, Set<Integer>> map;
    Random r;

    public RandomizedCollection() {
        nums = new ArrayList<>();
        map = new HashMap<>();
        r = new Random();
    }

    public boolean insert(int val) {
        boolean res = !map.containsKey(val);
        if (res) map.put(val, new HashSet<>());
        map.get(val).add(nums.size());
        nums.add(val);
        return res;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;

        Set<Integer> set = map.get(val);
        int i = set.iterator().next();
        if (set.size() == 1) {
            map.remove(val);
        } else {
            set.remove(i);
        }

        int j = nums.size() - 1;
        if (i != j) {
            int tmp = nums.get(j);
            Set<Integer> tmpSet = map.get(tmp);
            tmpSet.add(i);
            tmpSet.remove(j);
            nums.set(i, tmp);
        }
        nums.remove(j);
        return true;
    }

    public int getRandom() {
        return nums.get(r.nextInt(nums.size()));
    }

    public static void main(String[] args) {
        RandomizedCollection randomizedCollection = new RandomizedCollection();
        System.out.println(randomizedCollection.insert(0));
        System.out.println(randomizedCollection.insert(1));
        System.out.println(randomizedCollection.remove(0));
        System.out.println(randomizedCollection.insert(2));
        System.out.println(randomizedCollection.remove(1));
        System.out.println(randomizedCollection.getRandom());
    }
}
