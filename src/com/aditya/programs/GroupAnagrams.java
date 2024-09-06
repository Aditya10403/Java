package com.aditya.programs;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = { "eat","tea","tan","ate","nat","bat" };
        System.out.println(groupAnagrams(strs));
    }
    /**
     * [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
    private static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String word = new String(chars);
            if (!map.containsKey(word)) map.put(word, new ArrayList<>());
            map.get(word).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
