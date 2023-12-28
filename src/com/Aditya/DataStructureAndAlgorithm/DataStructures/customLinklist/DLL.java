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
    public void Display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
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
