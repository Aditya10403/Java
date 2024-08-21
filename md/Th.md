# Java Threads

## Program, Processes and threads.

**`Program`**: A Program is an executable file which contains a certain set of instructions written 
to complete the specific job or operation on our computer. 
- It’s a compiled code. Ready to be executed.
- Stored in Disk

**`Process`**: Program under execution. Resides in Computer’s primary memory (RAM). 

**`Threads`**
- Single sequence stream within a process.
- An independent path of execution in a process.
- Light-weight process, Used to achieve parallelism. 

| Processes                                                | Threads                                                        |
| -------------------------------------------------------- | -------------------------------------------------------------- |
| Process is related to execution of a program.            | Process consists of multiple threads.                          |
| Processes communicate with each other using inter-process communication. | Threads of a process can communicate with each other.          |
| Processes have control over the child processes.         | Threads of a process can have control over other threads.      |
| Any modification in the parent process does not alter child processes. | Any modification in the main thread may impact the behavior of other threads of the process. |
| Processes get executed in separate memory spaces.        | Threads are executed in shared memory spaces.                  |
| Operating system controls the process.                   | Developer of the software has control over the usage of the threads. |
| Processes are independent of each other.                 | Threads are dependent on each other.                           |

## Different ways of creating a thread

- A class may extend the `Thread` class
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
```

- A class may implement the `Runnable` interface
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
```

## Thread states in a high-level.

During its execution, a thread can reside in one of the following states:

- **NEW**: The thread becomes ready to run, but does not necessarily start running immediately.
- **RUNNABLE**: The Java Virtual Machine (JVM) is actively executing the thread’s code.
- **BLOCKED**: The thread is in a blocked state while waiting for a monitor lock.
- **WAITING**: The thread waits for another thread to perform a particular action.
- **TIMED_WAITING**: The thread waits for another thread to perform a particular action up to a specified waiting time.
- **TERMINATED**: The thread has finished its execution.
```java
public class ThreadStateExample extends Thread {
    public void run() {
        System.out.println("Thread is running.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }

    public static void main(String[] args) {
        ThreadStateExample t = new ThreadStateExample();
        System.out.println("Thread state: " + t.getState()); // NEW
        t.start();
        System.out.println("Thread state: " + t.getState()); // RUNNABLE
        try {
            Thread.sleep(500);
            System.out.println("Thread state: " + t.getState()); // TIMED_WAITING
            t.join();
            System.out.println("Thread state: " + t.getState()); // TERMINATED
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```

## Thread Synchronization

When multiple threads access shared resources, they can interfere with each other leading to inconsistent results. Java provides synchronization mechanisms to control this.

## Synchronized Method and Block.

In Java programming, each object has a lock. A thread can acquire the lock for an object by using the `synchronized` keyword. The `synchronized` keyword can be applied in a method level (coarse-grained lock) or block level of code (fine-grained lock).

`Sychronized Method`
```java
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

class SynchronizedDemo {
    public static void main(String[] args) {
        SynchronizedMethodExample example = new SynchronizedMethodExample();
        ThreadA t1 = new ThreadA(example);
        ThreadA t2 = new ThreadA(example);
        t1.start();
        t2.start();
    }
}
```

`Sychronized Block`
```java
class SynchronizedBlockExample {
    public void printNumbers() {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

class ThreadB extends Thread {
    SynchronizedBlockExample example;

    ThreadB(SynchronizedBlockExample example) {
        this.example = example;
    }

    public void run() {
        example.printNumbers();
    }
}

class SynchronizedDemoBlock {
    public static void main(String[] args) {
        SynchronizedBlockExample example = new SynchronizedBlockExample();
        ThreadB t1 = new ThreadB(example);
        ThreadB t2 = new ThreadB(example);
        t1.start();
        t2.start();
    }
}
```

## How does thread synchronization occur inside a monitor?

The JVM uses locks in conjunction with monitors. A monitor is basically a guardian that watches over a sequence of synchronized code, ensuring that only one thread at a time executes a synchronized piece of code. Each monitor is associated with an object reference. The thread is not allowed to execute the code until it obtains the lock.

## Deadlock

Process requests a resource (`R`), if `R` is not available (`taken by other process`), process enters in a waiting state. Sometimes that waiting process is never able to change its state because the resource, it has requested is busy (forever), called `DEADLOCK` (DL).

```java
public class DeadlockExample {
    public static void main(String[] args) {
        final String resource1 = "Resource 1";
        final String resource2 = "Resource 2";

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource 2");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
```

`Avoiding deadlock`
```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AvoidDeadlockExample {
    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> acquireLocks(lock1, lock2));
        Thread t2 = new Thread(() -> acquireLocks(lock2, lock1));

        t1.start();
        t2.start();
    }

    private static void acquireLocks(Lock firstLock, Lock secondLock) {
        boolean gotFirstLock = false;
        boolean gotSecondLock = false;

        while (true) {
            try {
                gotFirstLock = firstLock.tryLock();
                gotSecondLock = secondLock.tryLock();
            } finally {
                if (gotFirstLock && gotSecondLock) {
                    System.out.println("Acquired both locks");
                    break;
                }
                if (gotFirstLock) {
                    firstLock.unlock();
                }
                if (gotSecondLock) {
                    secondLock.unlock();
                }
            }
        }

        try {
            // Critical section here
        } finally {
            firstLock.unlock();
            secondLock.unlock();
        }
    }
}
```

## How to ensure that N threads can access N resources without deadlock.

A very simple way to avoid deadlock while using N threads is to impose an ordering on the locks and force each thread to follow that ordering. Thus, if all threads lock and unlock the mutexes in the same order, no deadlocks can arise.

## `wait` Vs `sleep` method in Java

| Wait                                           | Sleep                                                   |
| ---------------------------------------------- | ------------------------------------------------------- |
| Call on current thread synchronizes on the lock object when there is a call on the object. | Call on a Thread happens on the currently executing thread. |
| Synchronized is used to access the same Object from multiple threads. | Synchronized is used to sleep over the Sleeping thread from multiple threads. |
| Release the lock for other objects to have the chance to execute. | Keep lock for at least t times if timeout specified or somebody interrupt. |
| Until call `notify()`, `notifyAll()` from object. | Until at least time expire or call `interrupt()`.       |
| For time-synchronization.                      | For multi-thread-synchronization.                       |

```java
class WaitSleepExample {
    public static void main(String[] args) {
        final Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread 1 is waiting.");
                    lock.wait();
                    System.out.println("Thread 1 is notified.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                synchronized (lock) {
                    System.out.println("Thread 2 is notifying.");
                    lock.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}
```