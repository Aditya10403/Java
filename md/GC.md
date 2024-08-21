# Garbage Collectors

## What is the purpose of garbage collection in Java, and when is it used?

Garbage collection (GC) is a process by which Java programs perform automatic memory management. The garbage collector reclaims memory used by objects that are no longer reachable or needed, ensuring efficient memory usage and avoiding memory leaks.

## What do `System.gc()` and `Runtime.gc()` methods do?

These methods can be used as a hint to the JVM to start garbage collection. However, it is up to the Java Virtual Machine (JVM) to decide when to start the garbage collection.

```java
public class ReferenceObject {  
    public void finalize() {
        System.out.println("object is garbage collected");
    }
 
    public static void main(String args[]) {  
        ReferenceObject obj1 = new ReferenceObject();  
        ReferenceObject obj2 = new ReferenceObject();  
        obj1 = null;  
        obj2 = null;  
        System.gc(); 
        Runtime.gc(); 
    }  
}
```

## When is the finalize() method called? What is the purpose of finalization?

The finalize method is called by the garbage collector just before releasing the object’s memory. It is normally advised to release resources held by the object inside the finalize method.

```java
public class ReferenceObject {  
    public void finalize() {
        System.out.println("object is garbage collected");
    }
}
```

## If an object reference is set to null, will the Garbage Collector immediately free the memory held by that object?

No, the object will be available for garbage collection in the next cycle of the garbage collector.

## What is the structure of Java Heap?

The JVM heap is the runtime data area from which memory for all class instances and arrays is allocated.

- The Java heap is the area of memory used for dynamic memory allocation. 
- It is divided into generations: Young Generation, Old Generation, and Permanent Generation (Metaspace in newer versions of Java).

## What is the difference between Serial and Throughput Garbage Collector?

Throughput Garbage Collector: Uses a parallel version of the young generation collector, intended for applications with medium to large data sets.
Serial Garbage Collector: Adequate for most small applications, usually requiring heaps of up to approximately 100MB on modern processors.

## When does an object become eligible for garbage collection in Java?

An object becomes eligible for garbage collection when it becomes unreachable by the program in which it is currently used.

## Does garbage collection occur in the permanent generation space in JVM?

Garbage Collection does occur in PermGen space, and if PermGen space is full or crosses a threshold, it can trigger a full garbage collection. Proper sizing of PermGen space is important to avoid frequent full garbage collections.

## Types of Garbage Collectors

Java provides several garbage collectors, each with different performance characteristics:

1. **Serial GC**: Uses a single thread to perform all garbage collection work, suitable for small applications.

2. **Parallel GC**: Uses multiple threads for minor garbage collection but a single thread for major collection.

3. **Concurrent Mark Sweep (CMS)**: Performs most of its work concurrently, minimizing pauses in the application.

4. **G1 GC (Garbage First)**: Divides the heap into regions and performs garbage collection in parallel, aiming to minimize pause times and provide predictability.

5. **ZGC and Shenandoah**: Focus on extremely low pause times and large heaps, available in newer Java versions.

## Garbage Collection Process

1. **Marking Phase**: Identifies which objects are still in use and which are not.
2. **Normal Deletion**: Deletes unused objects and reclaims their memory.
3. **Compaction (optional)**: Moves the remaining objects to eliminate fragmentation.

## Tuning Garbage Collection

- Garbage collection can be tuned using JVM options to select different garbage collectors, adjust heap size, and other parameters.
