package com.Aditya.DataStructureAndAlgorithm.DataStructures.HashMap;

import java.util.HashMap;

public class PreIn {
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
    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < inOrder.length; i++) {
            map.put(inOrder[i], i);
        }
        int[] index = {0};
        return helper(preOrder, inOrder, 0, preOrder.length-1, map, index);
    }
    public TreeNode helper(int[] preOrder, int[] inOrder, int left, int right, HashMap<Integer, Integer> map, int[] index) {
        if (left > right) {
            return null;
        }
        int current = preOrder[index[0]];
        index[0]++;
        TreeNode node = new TreeNode(current);

        if (left == right) {
            return node;
        }
        int inorderIndex = map.get(current);
        node.left = helper(preOrder, inOrder, left, inorderIndex - 1, map, index);
        node.right = helper(preOrder, inOrder, inorderIndex + 1, right, map, index);
        return node;
    }
}
