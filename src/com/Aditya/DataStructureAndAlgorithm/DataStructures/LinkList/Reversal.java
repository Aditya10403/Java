package com.Aditya.DataStructureAndAlgorithm.DataStructures.LinkList;

import java.util.List;

public class Reversal {
    public static void main(String[] args) {

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int x) {
            val = x;
            next = null;
        }
        ListNode(int val, Sorting.ListNode next) { this.val = val; this.next = next; }
    }
    // Recursion reverse
    private void reverse(ListNode node) {
        ListNode head;
        ListNode tail = null;
        if (node == tail) {
            head = tail;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    // in place reversal
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode prev = null;
        ListNode present = head;
        ListNode next = head.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
    // Reverse II - range reversal
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode end = current;
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        end.next = current;
        return head;
    }
}
