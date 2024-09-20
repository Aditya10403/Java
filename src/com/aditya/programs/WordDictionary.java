package com.aditya.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordDictionary {
    Map<Integer, Set<String>> map;

    public WordDictionary() {
        map = new HashMap<>();
    }

    public void addWord(String word) {
        int n = word.length();
        if (!map.containsKey(n)){
            Set<String> set = new HashSet<>();
            set.add(word);
            map.put(n, set);
        } else map.get(n).add(word);
    }

    public boolean search(String word) {
        int n = word.length();
        if (!map.containsKey(n)) return false;

        Set<String> set = map.get(n);
        if (isWords(word)) return set.contains(word);

        for (String s : set) {
            if (isSame(s, word)) return true;
        }
        return false;
    }

    public boolean isWords(String s){
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '.') return false;
        }
        return true;
    }

    public boolean isSame(String s, String word) {
        if (s.length() != word.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            char ch = word.charAt(i);
            if (ch != '.' && ch != s.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.println(wordDictionary.search("pad")); // return False
        System.out.println(wordDictionary.search("bad")); // return True
        System.out.println(wordDictionary.search(".ad")); // return True
        System.out.println(wordDictionary.search("b..")); // return True
    }
}

