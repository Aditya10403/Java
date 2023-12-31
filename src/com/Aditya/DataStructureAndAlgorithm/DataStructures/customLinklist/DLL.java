package com.Aditya.DataStructureAndAlgorithm.DataStructures.customLinklist;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        if (tail == null){
            tail = head;
        }
        head = node;
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        node.next = null;
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node;
        node.prev = tmp;
    }


    public void Display(){
        Node temp = head;
        System.out.println("Original :-");
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Reverse :-");
        Node i = head;
        Node tail = null;
        while (i != null){
            tail = i;
            i = i.next;
        }
        while (tail != null){
            System.out.print(tail.val + " -> ");
            tail = tail.prev;
        }
        System.out.print("START");
    }

    private class Node{
        int val;
        private Node next;
        private Node prev;

        private Node(int val){
            this.val = val;
        }
        private Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
