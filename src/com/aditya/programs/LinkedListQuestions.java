package com.aditya.programs;

public class LinkedListQuestions {
    public static void main(String[] args) {
        ListNode l = new ListNode(); // 1,3,4,1,2,6
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    /**
     * i/p -> 2,1,3,5,6,4,7 <br>
     * o/p -> 2,3,6,7,1,5,4
     */
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return head;
        ListNode i = head;
        ListNode evenStart = head.next;
        ListNode j = head.next;
        while (i.next != null && j.next != null) {
            i.next = i.next.next;
            j.next = j.next.next;
            i = i.next;
            j = j.next;
        }
        i.next = evenStart;
        return head;
    }
}
