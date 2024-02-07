package com.Aditya.DataStructureAndAlgorithm.DataStructures.Trees;

import java.util.*;

public class BreadthFirstSearch {
    public static void main(String[] args) {

    }

//     Definition for a binary tree node.
     public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        public TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
     }
     public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> result = new ArrayList<>();

         if (root == null) return result;

         Queue<TreeNode> queue = new LinkedList<>();
         queue.offer(root);

         while (!queue.isEmpty()) {
             int levelSize = queue.size();
             List<Integer> currentLevel = new ArrayList<>();
             for (int i = 0; i < levelSize; i++) {
                 TreeNode currentNode = queue.poll();
                 currentLevel.add(currentNode.val);
                 if (currentNode.left != null) {
                     queue.offer(currentNode.left);
                 }
                 if (currentNode.right != null) {
                     queue.offer(currentNode.right);
                 }
             }
             result.add(currentLevel);
         }

         return result;
     }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double averageLevel = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                averageLevel += currentNode.val;
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            averageLevel = averageLevel/levelSize;
            result.add(averageLevel);
        }

        return result;
    }
    // level Order Successor of a node
    public TreeNode levelOrderSuccessor(TreeNode root, int target) {
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
            if (currentNode.val == target) {
                break;
            }
        }
        return queue.peek();
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse = false;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                if (!reverse) {
                    TreeNode currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val);
                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }
                } else {
                    TreeNode currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);
                    if (currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        queue.addFirst(currentNode.left);
                    }
                }
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(result.size() ,currentLevel);
        }
        return result;
    }
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public Node connect(Node root) {
        if (root == null) return null;

        Node leftMost = root;
        while (leftMost.left != null) {
            Node current = leftMost;
            while (current != null) {
                current.left.next = current.right;
                if (current.next != null) {
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                if (i == levelSize-1) {
                    result.add(currentNode.val);
                }
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }
        return result;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (
                (level(root, xx, 0) == level(root, yy, 0) && (!isSibling(root, xx, yy)))
                );
    }

    private boolean isSibling(TreeNode node, TreeNode x, TreeNode y) {
        if (node == null) return false;
        return (
                (node.left == x && node.right == y) || (node.left == y && node.right == x)
                || isSibling(node.left, x, y) || isSibling(node.right, x, y)
                );
    }

    private int level(TreeNode node, TreeNode x, int lev) {
        if (node == null) return 0;
        if (node == x) {
            return lev;
        }
        int l = level(node.left, x, lev+1);
        if (l != 0) return l;
        return level(node.right, x, lev+1);
    }

    private TreeNode findNode(TreeNode node, int x) {
        if (node == null) return null;
        if (node.val == x) {
            return node;
        }
        TreeNode n = findNode(node.left, x);
        if (n != null) {
            return n;
        }
        return findNode(node.right, x);
    }
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
}
