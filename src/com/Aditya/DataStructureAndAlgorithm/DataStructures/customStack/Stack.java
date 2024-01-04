package com.Aditya.DataStructureAndAlgorithm.DataStructures.customStack;

public class Stack {
    protected int[] data;
    int ptr = -1;
    private static final int DEFAULT_SIZE = 10;
    public Stack() {
        this(DEFAULT_SIZE);
    }
    public Stack(int size){
        this.data = new int[size];
    }
    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full - OverFlow!");
            return false;
        }
        data[++ptr] = item;
        return true;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty - UnderFlow!");
        }
        return data[ptr--];
    }
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty - UnderFlow!");
        }
        return data[ptr];
    }
    public void display() {
        if (isEmpty()) {
            return;
        }
        int i = ptr;
        System.out.println("Stack Status -> ");
        while (i >= 0) {
            System.out.print(data[i] + " ");
            i--;
        }
        System.out.println();
    }
    public boolean isFull() {
        return ptr == data.length - 1;
    }
    public boolean isEmpty() {
        return ptr == - 1;
    }
}
