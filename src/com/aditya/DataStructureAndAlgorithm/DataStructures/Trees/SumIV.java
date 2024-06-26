package com.aditya.DataStructureAndAlgorithm.DataStructures.Trees;

import java.util.HashSet;

public class SumIV {
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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return helperSum(root, k, set);
    }

    private boolean helperSum(TreeNode node, int k, HashSet<Integer> set) {
        if (node == null) return false;

        if (set.contains(k-node.val)) return true;
        set.add(node.val);

        return helperSum(node.left, k, set) || helperSum(node.right, k, set);
    }
}
