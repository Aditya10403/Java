package com.Aditya.DataStructureAndAlgorithm.DataStructures.LinkList;

public class LinklistCycle {
    public static void main(String[] args) {

    }
    //  Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
    // find length of cycle
    public int lengthOfCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                int count = 0;
                ListNode tmp = slow;
                do {
                    tmp = tmp.next;
                    count++;
                } while (tmp != slow);
                return count;
            }
        }
        return 0;
    }
    // cycle II
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthOfCycle(slow);
                break;
            }
        }
        if (length == 0) return null;
        // find the start node.
        ListNode first = head;
        ListNode second = head;

        while (length > 0){
            second = second.next;
            length--;
        }

        // keep moving both forward till they meet at cycle start
        while (first != second){
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
