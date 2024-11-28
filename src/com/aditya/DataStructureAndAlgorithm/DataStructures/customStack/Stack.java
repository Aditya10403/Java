package com.aditya.DataStructureAndAlgorithm.DataStructures.customStack;

public class Stack {
    protected int[] data;
    private int top;
    private static final int DEFAULT_SIZE = 10;

    public Stack () {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        this.data = new int[size];
        this.top = -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        data[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty - Underflow!");
        }
        return data[top--];
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        return data[top];
    }

    public void status() {
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        int i = 0;
        System.out.print("Stack Status-> ");
        while (i <= top) {
            System.out.print(data[i++] + " ");
        }
        System.out.print("End\n");
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length-1;
    }

}
