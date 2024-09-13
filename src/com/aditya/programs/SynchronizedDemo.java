package com.aditya.programs;

class SynchronizedDemo {
    public static void main(String[] args) {
        SynchronizedMethodExample example = new SynchronizedMethodExample();
        ThreadA t1 = new ThreadA(example);
        ThreadA t2 = new ThreadA(example);
        t1.start();
        t2.start();
    }
}

class SynchronizedMethodExample {
    public synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

class ThreadA extends Thread {
    SynchronizedMethodExample example;

    ThreadA(SynchronizedMethodExample example) {
        this.example = example;
    }

    public void run() {
        example.printNumbers();
    }
}
