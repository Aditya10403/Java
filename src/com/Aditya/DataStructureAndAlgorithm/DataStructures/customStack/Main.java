package com.Aditya.DataStructureAndAlgorithm.DataStructures.customStack;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        System.out.println("Peek - " + stack.peek());
        System.out.println("Popped - " + stack.pop());
        System.out.println("Popped - " + stack.pop());
        System.out.println("Popped - " + stack.pop());
        System.out.println("Popped - " + stack.pop());
//        System.out.println("Popped - " + stack.pop());
        stack.display();
    }
}
