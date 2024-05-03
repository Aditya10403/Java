package com.Aditya.DataStructureAndAlgorithm.DataStructures.customLinklist;

public class LinkedList {
    Node head;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtMiddle(int data, int key) {
        boolean flag = false;
        Node newNode = new Node(data);
        Node tmp = head;
        while (tmp != null) {
            if (tmp.data == key){
                flag = true;
                break;
            }
            tmp = tmp.next;
        }
        Node nextNode = tmp.next;
        if (flag) {
            tmp.next = newNode;
            newNode.next = nextNode;
        }
    }

    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // method to delete an element from the middle
    public void deleteAtMiddle(int key) {
        boolean flag = false;
        Node tmp = head;
        Node prev = null;
        while (tmp != null) {
            if (tmp.data == key){
                flag = true;
                break;
            }
            prev = tmp;
            tmp = tmp.next;
        }
        Node next;
        next = tmp.next;
        if (flag) {
            prev.next = next;
            tmp.next = null;
        }
    }

    public void show() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("NULL");
    }
}
