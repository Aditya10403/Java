package com.Aditya.DataStructureAndAlgorithm.DataStructures.LinkList;

import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        int[] arr = { 1,2,3,4,5 };
        for (int i = 0; i < 5; i++) {
            list = new ListNode(arr[i]);
        }
        int k = 3;
        System.out.println(reverseKGroup(list, k));
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int x) {
            val = x;
            next = null;
        }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        ListNode mid = middleNode(head);
        ListNode headsec = reverseList(mid);
        ListNode reversehead = headsec;

        // compare
        while (head != null && headsec != null) {
            if (head.val != headsec.val) {
                break;
            }
            head = head.next;
            headsec = headsec.next;
        }
        reverseList(reversehead);

        return (head == null || headsec == null);
    }
    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static ListNode reverseList(ListNode head) {
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
    // Reorder List
    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode headfirst = head;
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        // rearrange
        while (headfirst != null && headSecond != null) {
            ListNode tmp = headfirst.next;
            headfirst.next = headSecond;
            headfirst = tmp;

            tmp = headSecond.next;
            headSecond.next = headfirst;
            headSecond = tmp;
        }
        // setting tail to null
        if (headfirst != null) {
            headfirst.next = null;
        }
    }
    // reverseGroup
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) return head;

        ListNode current = head;
        ListNode prev = null;
        while (true) {
            ListNode last = prev;
            ListNode end = current;
            ListNode next = current.next;

            for (int i = 0; current != null && i < k; i++) {
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
            /* for reversing alternate k
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }*/
            if (current == null) {
                break;
            }
            prev = end;
        }
        return head;
    }
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
    // rotate list k times
    public static ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null) return head;
        ListNode last = head;
        ListNode prev = null;
        int c = 1;
        while (last.next != null) {
            last = last.next;
            c++;
        }
        last.next = head;
        int r = k % c;
        int skip = c - r;
        ListNode newlast = head;
        for (int i = 0; i < skip - 1; i++) {
            newlast = newlast.next;
        }
        head = newlast.next;
        newlast.next = null;
        return head;
    }
}
