package com.Aditya.DS.CustomLinklist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(1);
        list.insertFirst(9);
        list.insertLast(99);
        list.insertLast(100);
        list.insert(2,3);
        list.Display();
        System.out.println(list.deleteFirst());
        list.Display();
        System.out.println(list.deleteLast());
        list.Display();
        System.out.println(list.delete(0));
        list.Display();
        System.out.println(list.delete(1));
        list.Display();
        list.search(5);
    }
}
