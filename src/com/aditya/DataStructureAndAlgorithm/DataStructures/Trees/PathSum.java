package com.aditya.DataStructureAndAlgorithm.DataStructures.Trees;

public class PathSum {
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    }
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode node, int sum) {
        if (node == null) return 0;
        sum = sum * 10 + node.val;
        if (node.left == null && node.right == null) {
            return sum;
        }
        return helper(node.left, sum) + helper(node.right, sum);
    }
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helperSum(root);
        return ans;
    }

    private int helperSum(TreeNode node) {
        if (node == null) return 0;
        int left = helperSum(node.left);
        int right = helperSum(node.right);
        left = Math.max(0, left);
        right = Math.max(0, right);
        int sum = node.val + left + right;
        ans = Math.max(ans, sum);
        return Math.max(left, right) + node.val;
    }
    public boolean pathExists(TreeNode node, int[] path) {
        if (node == null) return path.length == 0;
        return helperPath(node, path, 0);
    }

    private boolean helperPath(TreeNode node, int[] path, int index) {
        if (node == null) return false;
        if (index >= path.length || node.val != path[index]) {
            return false;
        }
        if (node.left == null && node.right == null && index == path.length-1) {
            return true;
        }
        return helperPath(node.left, path, index+1) || helperPath(node.right, path, index+1);
    }
}
