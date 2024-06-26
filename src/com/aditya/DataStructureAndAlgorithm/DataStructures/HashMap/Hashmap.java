package com.aditya.DataStructureAndAlgorithm.DataStructures.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
//        String name = "Aditya";
//        int code = name.hashCode();
//        System.out.println(code);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
//        System.out.println(map.get("a"));
//        System.out.println(map.getOrDefault("a",2));

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(9);
        set.add(16);
        set.add(1);
        set.add(4);
        set.add(23);
//        System.out.println(set);
        MapusingHash m = new MapusingHash();
        m.put("M","d");
        m.put("a","e");
        m.put("r","e");
        System.out.println(m.get("M"));
    }
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for (int it : set) {
            if (!set.contains(it - 1)) {
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
class MapusingHash {
    private Entity[] entities;
    public MapusingHash() {
        entities = new Entity[100];
    }
    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }
    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }
    public  void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }
    private class Entity {
        String key;
        String value;
        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
