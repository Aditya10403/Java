package com.aditya.DataStructureAndAlgorithm.DataStructures.customStack;

public class Stack {
    int[] data;
    int top = -1;
    Stack(int size){
        this.data = new int[size];
    }
    public boolean push(int val){
        if (isFull()) {
            System.out.println("Stack is full - Overflow!");
            return false;
        }
        data[++top] = val;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()) {
            throw new Exception("Stack is empty - Underflow!");
        }
        return data[top--];
    }
    public int peek() throws Exception{
        if(isEmpty()) {
            throw new Exception("Stack is empty - Underflow!");
        }
        return data[top];
    }
    public void display(){
        if (isEmpty()){
            return;
        }
        System.out.println("Stack => ");
        for (int i = 0; i <= top; i++) {
            System.out.print(data[i] + " ");
        }
    }
    public boolean isFull() {
        return top == data.length - 1;
    }
    public boolean isEmpty() {
        return top == - 1;
    }



































/*
    protected int[] data;
    int top = -1;
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
        data[++top] = item;
        return true;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty - UnderFlow!");
        }
        return data[top--];
    }
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty - UnderFlow!");
        }
        return data[top];
    }
    public void display() {
        if (isEmpty()) {
            return;
        }
        int i = top;
        System.out.println("Stack Status -> ");
        while (i >= 0) {
            System.out.print(data[i] + " ");
            i--;
        }
        System.out.println();
    }
    public boolean isFull() {
        return top == data.length - 1;
    }
    public boolean isEmpty() {
        return top == - 1;
    }*/
}
