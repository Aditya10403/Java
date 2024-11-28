package com.aditya.DataStructureAndAlgorithm.DataStructures.customStack;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(5);
//        stack.pop();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(5);
        stack.status();
        stack.push(5);
        stack.status();
//        Stack stack = new Stack(5);
////        stack.push(1);
////        stack.push(2);
////        stack.push(3);
////        stack.push(4);
////        stack.display();
////        System.out.println("Peek - " + stack.peek());
////        System.out.println("Popped - " + stack.pop());
////        System.out.println("Popped - " + stack.pop());
////        System.out.println("Popped - " + stack.pop());
////        System.out.println("Popped - " + stack.pop());
////        System.out.println("Popped - " + stack.pop());
//////        System.out.println("Popped - " + stack.pop());
////        stack.display();
//        Scanner scanner = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println("\nStack Operations:");
//            System.out.println("1. Push");
//            System.out.println("2. Pop");
//            System.out.println("3. Peek");
//            System.out.println("4. Display");
//            System.out.println("5. Quit");
//            System.out.println("Enter your choice: ");
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter the value to push: ");
//                    stack.push(scanner.nextInt());
//                    break;
//                case 2:
//                    if (!stack.isEmpty()) {
//                        System.out.println("Popped value: " + stack.pop());
//                    } else {
//                        System.out.println("Stack is empty");
//                    }
//                    break;
//                case 3:
//                    if (!stack.isEmpty()) {
//                        System.out.println("Peek value: " + stack.peek());
//                    } else {
//                        System.out.println("Stack is empty");
//                    }
//                    break;
//                case 4:
//                    if (stack.isEmpty()) {
//                        System.out.println("Stack is empty");
//                    } else {
//                        stack.display();
//                    }
//                    break;
//                case 5:
//                    System.out.println("Exiting...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        } while (choice != 6);
//        scanner.close();
//        System.out.println('c'-'a');
    }
}
