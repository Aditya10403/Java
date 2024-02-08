package com.Aditya.DataStructureAndAlgorithm.DataStructures.HashMap;

import java.util.*;

public class WordLadder {
    public static void main(String[] args) {

    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) return 0;
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int length = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            length++;
            for (int i = 0; i < size; i++) {
                String current = q.poll();
                for (int j = 0; j < current.length(); j++) {
                    char[] tmp = current.toCharArray();
                    for (char k = 'a'; k < 'z'; k++) {
                        tmp[j] = k;
                        String newWord = new String(tmp);
                        if (newWord.equals(endWord)) {
                            return length+1;
                        }
                        if (wordList.contains(newWord) && !visited.contains(newWord)) {
                            q.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
        }
        return 0;
    }
}
