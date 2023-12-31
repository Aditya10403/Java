package com.Aditya.DataStructureAndAlgorithm.DataStructures.customLinklist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(0);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertLast(-1);
        list.insertRec(88, 3);
        list.Display();
    }
}
