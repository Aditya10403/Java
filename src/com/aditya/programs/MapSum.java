package com.aditya.programs;

import java.util.HashMap;
import java.util.Map;

public class MapSum {

    private final Map<String, Integer> map = new HashMap<>();
    private final Map<String, Integer> prefixSums = new HashMap<>();

    public MapSum() {}

    public void insert(String key, int val) {
        Integer stored = map.remove(key);
        map.put(key, val);
        calcPrefixesSum(key, stored != null ? val - stored : val);
    }

    private void calcPrefixesSum(String key, int val) {
        for (int i = 1; i <= key.length(); i++) {
            String prefix = key.substring(0, i);
            int currentSum = prefixSums.getOrDefault(prefix, 0);
            prefixSums.put(prefix, currentSum + val);
        }
    }

    public int sum(String prefix) {
        return prefixSums.getOrDefault(prefix, 0);
    }

    public static void main(String[] args) {
        MapSum mapSum = new MapSum();
        mapSum.insert("a",3);
        System.out.println(mapSum.sum("ap"));        // return 3 (apple = 3)
        mapSum.insert("b",2);
        System.out.println(mapSum.sum("a"));           // return 5 (apple + app = 3 + 2 = 5)
    }
}
