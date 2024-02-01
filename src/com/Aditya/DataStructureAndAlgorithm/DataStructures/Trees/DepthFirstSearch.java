package com.Aditya.DataStructureAndAlgorithm.DataStructures.Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DepthFirstSearch {
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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(diameter, dia);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;
        return root;
    }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return sortedArrayToBST(nums, 0, nums.length);
    }
    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start >= end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, start, mid);
        node.right = sortedArrayToBST(nums, mid+1, end);
        return node;
    }
    public void flatten(TreeNode root) {
        if (root == null) return;
        TreeNode current = root;
        while (current != null) {
            if (current.left != null) {
                TreeNode rightmost = current.left;
                while (rightmost.right != null) {
                    rightmost = rightmost.right;
                }
                rightmost.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode node, Integer low, Integer high) {
        if (node == null) return true;
        if (low != null && node.val <= low) {
            return false;
        }
        if (high != null && node.val >= high) {
            return false;
        }
        boolean leftTree = helper(node.left, low, node.val);
        boolean rightTree = helper(node.right, node.val, high);
        return leftTree && rightTree;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        // Ignore searching below
        return left == null ? right : left;
    }
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return kthhelper(root,k).val;
    }
    public TreeNode kthhelper(TreeNode root, int k) {
        if (root == null) return null;
        TreeNode left = kthhelper(root.left, k);
        if (left != null) {
            return left;
        }
        count++;
        if (count == k) {
            return root;
        }
        return kthhelper(root.right, k);
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        int r = preorder[0];
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == r){
                index = i;
            }
        }
        TreeNode node = new TreeNode(r);
        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index+1), Arrays.copyOfRange(inorder, 0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index+1, preorder.length), Arrays.copyOfRange(inorder, index+1, inorder.length));
        return node;
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String s = "";
        helperS(root, s);
        return s;
    }
    void helperS(TreeNode node, String s) {
        if (node == null) {
            s += "null,";
            return;
        } s += String.valueOf(node.val) + ",";
        helperS(node.left, s);
        helperS(node.right, s);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String string) {
//        if (string.charAt(string.length()-1) == ",") {
//            string = string.substring(0, string.length() - 1);
//        }
        string = Arrays.toString(string.split(","));
        StringBuilder s = new StringBuilder(string);
        s.reverse();
        TreeNode node = helperD(s);
        return node;
    }
    TreeNode helperD(StringBuilder s) {
        String val = String.valueOf(s.deleteCharAt(s.length()-1));
        if (val.charAt(0) == 'n') return null;
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = helperD(s);
        node.right = helperD(s);
        return node;
    }
    /*
    public List<String> serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        helperS(root, list);
        return list;
    }
    void helperS(TreeNode node, List<String> list) {
        if (node == null) {
            list.add("null");
            return;
        } list.add(String.valueOf(node.val));
        helperS(node.left, list);
        helperS(node.right, list);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(List<String> list) {
        Collections.reverse(list);
        TreeNode node = helperD(list);
        return node;
    }
    TreeNode helperD(List<String> list) {
        String val = list.remove(list.size()-1);
        if (val.charAt(0) == 'n') return null;
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = helperD(list);
        node.right = helperD(list);
        return node;
    }*/
}
