# Collection Frameworks

## Table of Contents

- [1. Introduction to Collection Framework](#introduction-to-collection-framework)
- [2. List Interface](#list-interface)
  - [2.1 ArrayList](#arraylist)
  - [2.2 LinkedList](#linkedlist)
- [3. Set Interface](#set-interface)
  - [3.1 HashSet](#hashset)
  - [3.2 TreeSet](#treeset)
- [4. Stack](#stack)
- [5. Queue Interface](#queue-interface)
  - [5.1 PriorityQueue](#priorityqueue)
  - [5.2 Deque](#deque)
- [6. Map Interface](#map-interface)
  - [6.1 HashMap](#hashmap)
  - [6.2 TreeMap](#treemap)
- [7. Iterators and Comparators](#iterators-and-comparators)
  - [7.1 Iterator](#iterator)
  - [7.2 ListIterator](#listiterator)
  - [7.3 Enumeration](#enumeration)
  - [7.4 Comparable](#comparable)
  - [7.5 Comparator](#comparator)

## <a name="introduction-to-collection-framework">Introduction to Collection Framework</a>


Java Collections Framework provides a well-designed set of interfaces and classes that support operations on a collections of objects. The most basic interfaces that reside in the Java Collections Framework are:

- `Collection`, which represents a group of objects known as its elements.
- `Set`, which is a collection that cannot contain duplicate elements.
- `List`, which is an ordered collection and can contain duplicate elements.
- `Map`, which is an object that maps keys to values and cannot contain duplicate keys.

![alt](/images/image.png)

## Collection Interface
It defines the most common methods which are applicable to any collection object.

| **Property** | **Description** |
|--------------|-----------------|
| **Common Methods** | `boolean add(Object o)` <br> `boolean addAll(Collection c)` <br> `boolean remove(Object o)` <br> `boolean removeAll(Collection c)` <br> `boolean retainAll(Collection c)` <br> `void clear()` <br> `boolean contains(Object o)` <br> `boolean containsAll(Collection c)` <br> `boolean isEmpty()` <br> `int size()` <br> `Object[] toArray()` <br> `Iterator iterator()` |

## <a name="list-interface">List Interface</a>


The `List` interface is part of the Java Collection Framework and provides a way to store an ordered collection of elements. The `List` interface is implemented by various classes such as `ArrayList`, `LinkedList`, `Vector`, and `Stack`.
- Extends the `Collection` interface.
- Allows duplicate elements.
- Maintains the insertion order of elements.
- Provides positional access and insertion of elements.
- Allows null elements.

### Common Methods

| Method                                | Method                                |
|---------------------------------------|---------------------------------------|
| `void add(int index, E element)`      | `E remove(int index)`                 |
| `boolean add(E e)`                    | `boolean remove(Object o)`            |
| `E get(int index)`                    | `void clear()`                        |
| `E set(int index, E element)`         | `int size()`                          |
| `boolean contains(Object o)`          | `int indexOf(Object o)`               |
| `boolean isEmpty()`                   | `int lastIndexOf(Object o)`           |
| `Iterator<E> iterator()`              | `List<E> subList(int fromIndex, int toIndex)` |

```java
List<String> list = new ArrayList<>();
```

## <a name="arraylist">ArrayList</a>
 
![alt](/images/arraylist.png)

## <a name="linkedlist">LinkedList</a>


The `LinkedList` class in Java is a part of the Java Collections Framework and implements the `List` and `Deque` interfaces. It is a doubly linked list implementation, providing both list and queue operations.
- Doubly linked list implementation.
- Allows null elements.
- Maintains insertion order.
- Not synchronized, so not thread-safe.
- Can be used as a list, stack, or queue.

### Common Methods

| List Methods                          | Deque Methods                        |
|---------------------------------------|--------------------------------------|
| `void add(int index, E element)`      | `void addFirst(E e)`                 |
| `boolean add(E e)`                    | `void addLast(E e)`                  |
| `E get(int index)`                    | `E getFirst()`                       |
| `E remove(int index)`                 | `E getLast()`                        |
| `boolean remove(Object o)`            | `E removeFirst()`                    |
| `int size()`                          | `E removeLast()`                     |

### Implementation
```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Ram");
        list.add("Hanuman");
        list.add("Lakshman");
        
        System.out.println("LinkedList: " + list);
    }
}
```


## <a name="set-interface">Set Interface</a>



The `Set` interface is part of the Java Collection Framework and represents a collection that does not allow duplicate elements. It models the mathematical set abstraction and extends the `Collection` interface. The `Set` interface is implemented by various classes such as `HashSet`, `LinkedHashSet`, and `TreeSet`.
- Extends the `Collection` interface.
- Does not allow duplicate elements.
- Allows at most one `null` element (except for `TreeSet`).
- Does not guarantee the order of elements (except for `LinkedHashSet` and `TreeSet`).

### Common Methods

| Method                                | Method                                |
|---------------------------------------|---------------------------------------|
| `boolean add(E e)`                    | `boolean remove(Object o)`            |
| `void clear()`                        | `int size()`                          |
| `boolean contains(Object o)`          | `Iterator<E> iterator()`              |
| `boolean isEmpty()`                   | `boolean equals(Object o)`            |


## <a name="hashset">HashSet</a>



The `HashSet` class is part of the Java Collection Framework and implements the `Set` interface. 
- Backed by a hash table (actually a `HashMap` instance).
- Does not allow duplicate elements.
- Provides constant time performance for basic operations like add, remove, contains, and size.
- Allows null elements.

### Common Methods

| Method                                | Method                                |
|---------------------------------------|---------------------------------------|
| `boolean add(E e)`                    | `boolean remove(Object o)`            |
| `void clear()`                        | `int size()`                          |
| `boolean contains(Object o)`          | `boolean isEmpty()`              |
|

### Implementation
```java
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Ram");
        set.add("Hanuman");
        set.add("Lakshman");
        set.add("Hanuman");  // Duplicate element, will not be added
        set.remove("Lakshman")
        System.out.println("HashSet: " + set);
    }
}
```

## <a name="treeset">TreeSet</a>


The `TreeSet` class is part of the Java Collection Framework and implements the `NavigableSet` interface.
- Implements the `NavigableSet` interface.
- Backed by a `TreeMap`.
- Sorted in ascending order by default.
- Provides guaranteed log(n) time cost for the basic operations (`add`, `remove`, and `contains`).
- Does not allow `null` elements.
- Can use custom comparators for ordering.

### Common Methods

| Method                                | Method                                |
|---------------------------------------|---------------------------------------|
| `boolean add(E e)`                    | `boolean remove(Object o)`            |
| `void clear()`                        | `int size()`                          |
| `boolean contains(Object o)`          | `Iterator<E> iterator()`              |
| `E first()`                           | `E last()`                            |
| `E higher(E e)`                       | `E lower(E e)`                        |

### Implementation
```java
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Ram");
        set.add("Hanuman");
        set.add("Lakshman");
        
        System.out.println("TreeSet: " + set);
    }
}
```

## <a name="stack">Stack</a>

The `Stack` class in Java is part of the Java Collection Framework and represents a last-in, first-out (LIFO) stack of objects.
- Extends `Vector`.
- Represents a LIFO stack of objects.
- Provides methods to push, pop, peek, and search elements.
- Can store duplicate elements.
- Not synchronized, hence not thread-safe.

### Common Methods

| Method                                | Method                                |
|---------------------------------------|---------------------------------------|
| `E push(E item)`                      | `E pop()`                             |
| `E peek()`                            | `boolean empty()`                     |
| `int search(Object o)`                |                                       |

### Implementation
```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Ravan");
        stack.push("Ram");
        stack.push("Hanuman");
        stack.push("Lakshman");
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Stack: " + stack);
    }
}
```

## <a name="queue-interface">Queue Interface</a>


- The `Queue` interface, present in the `java.util` package, extends the `Collection` interface.
- It holds elements that are about to be processed in a FIFO (First In First Out) order.
  - Elements are added at the end of the list and removed from the beginning, following the First-In-First-Out principle.

## <a name="map-interface">Map Interface</a>

- If we need to represent a group of objects as key-value pairs, the `Map` interface is the way to go.
- This interface, also found in the `java.util` package, establishes a mapping between a key and a value.

Importantly, the `Map` interface is not a subtype of the `Collection` interface. This leads to some key differences in its behavior:

- **Duplicate keys are not allowed**.
- **Values can be duplicates**.
