package com.aditya.DataStructureAndAlgorithm.DataStructures.customQueue;

public class Queue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int front;
    private int rear;

    public Queue() {
        this(DEFAULT_SIZE);
    }

    public Queue(int size) {
        this.data = new int[size];
        this.front = 0;
        this.rear = 0;
    }

    public void enQueue(int val) {
        if (isFull()) {
            System.out.println("Queue Overflow!");
            return;
        }
        data[rear++] = val;
    }

    public int deQueue() {
        if (isEmpty()) throw new RuntimeException("Queue Underflow!");
        int removed =  data[front++];
        if (front == rear) {
            front = 0;
            rear = 0;
        }
        return removed;
    }

    public int getFront() {
        if (isEmpty()) throw new RuntimeException("Queue Underflow!");
        return data[front];
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public boolean isFull() {
        return rear == data.length;
    }

    public void display() {
        if (isEmpty()) throw new RuntimeException("Queue Underflow!");
        System.out.print("Queue Status-> ");
        for (int i = front; i < rear; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print("End\n");
    }
}
