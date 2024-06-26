package com.aditya.DataStructureAndAlgorithm.DataStructures.customQueue;

public class Queue {
    private int[] data;
    int end = 0;
    private static final int DEFAULT_SIZE = 10;
    public Queue() {
        this(DEFAULT_SIZE);
    }
    public Queue(int size){
        this.data = new int[size];
    }
    public boolean isFull() {
        return end == data.length;
    }
    public boolean isEmpty() {
        return end == 0;
    }
    public boolean insert(int item) {
        if (isFull()) return false;
        data[end++] = item;
        return true;
    }
    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        // shifting elements to left
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        System.out.println("Queue Status - ");
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
