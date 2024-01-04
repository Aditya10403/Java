package com.Aditya.DataStructureAndAlgorithm.DataStructures.customQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.display();
        System.out.println("Removed : " + queue.remove());
        queue.insert(9);
        System.out.println("Removed : " + queue.remove());
        System.out.println("Front : " + queue.front());
        queue.display();
    }
}
