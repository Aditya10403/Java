package com.aditya.DataStructureAndAlgorithm.DataStructures.Trees;

public class BinarySearchTree {
    public static void main(String[] args) {
        BST tree = new BST();
//        int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        tree.populate(nums);
        tree.populateSorted(nums);
//        tree.display();
        tree.Display();
        tree.preOrder();
        tree.inOrder();
        tree.postOrder();
        System.out.println("\nHeight : " + tree.height());
        System.out.println("Balanced : " + tree.balanced());
    }
}
class BST {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;
    public BST() {

    }
    public int height() {
        return height(this.root);
    }
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    public void insert(int value) {
        root = insert(value, root);
    }
    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }
    public void populate(int[] nums) {
        for (int num : nums) {
            this.insert(num);
        }
    }
    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }
    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }
    public void display() {
        display(this.root, "Root Node: ");
    }
    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }
    public boolean balanced() {
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    public void Display() {
        Display(this.root, 0);
    }
    private void Display(Node node, int level) {
        if (node == null) {
            return;
        }
        Display(node.right, level+1);
        if (level != 0) {
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.value);
        } else {
            System.out.println(node.value);
        }
        Display(node.left, level+1);
    }
    public void preOrder() {
        System.out.println("PreOrder -: ");
        preOrder(root);
    }
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder() {
        System.out.println("\nInOrder -: ");
        inOrder(root);
    }
    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }
    public void postOrder() {
        System.out.println("\nPostOrder -: ");
        postOrder(root);
    }
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
}
