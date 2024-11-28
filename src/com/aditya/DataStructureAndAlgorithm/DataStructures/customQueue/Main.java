package com.aditya.DataStructureAndAlgorithm.DataStructures.customQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.display();
        System.out.println("Removed : " + queue.deQueue());
        queue.enQueue(9);
        System.out.println("Removed : " + queue.deQueue());
        System.out.println("Front : " + queue.getFront());
        queue.display();
    }
}
