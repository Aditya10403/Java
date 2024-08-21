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

### Core Interfaces

- **`Collection`**
  - Represents a group of objects known as its elements.

- **`Set`**
  - A collection that cannot contain duplicate elements.
  - Common Implementations: `HashSet`, `LinkedHashSet`, `TreeSet`

- **`List`**
  - An ordered collection that can contain duplicate elements.
  - Common Implementations: `ArrayList`, `LinkedList`, `Vector`

- **`Map`**
  - An object that maps keys to values and cannot contain duplicate keys.
  - Common Implementations: `HashMap`, `LinkedHashMap`, `TreeMap`

- **`Queue`**
  - A collection designed for holding elements prior to processing. It supports operations for adding, removing, and examining elements.
  - Common Implementations: `LinkedList`, `PriorityQueue`, `ArrayDeque`

### Additional Interfaces

- **`Deque`** (Double-Ended Queue)
  - A subtype of `Queue` that allows elements to be added or removed from both ends.
  - Common Implementations: `ArrayDeque`, `LinkedList`

- **`SortedSet`**
  - Extends `Set` and provides a total ordering on its elements.
  - Common Implementation: `TreeSet`

- **`NavigableSet`**
  - Extends `SortedSet` and provides navigation methods for dealing with sorted elements.
  - Common Implementation: `TreeSet`

- **`SortedMap`**
  - Extends `Map` and provides a total ordering on its keys.
  - Common Implementation: `TreeMap`

- **`NavigableMap`**
  - Extends `SortedMap` and provides navigation methods for dealing with sorted keys.
  - Common Implementation: `TreeMap`

![alt](/images/image.png)

## Collection Interface


The `Collection` interface is the root interface in the Java Collection Framework. It represents a group of objects known as elements. The `Collection` interface provides basic operations to manipulate collections, such as adding, removing, and checking elements.
- Provides basic operations for manipulating collections.
- Serves as the foundation for more specific collection interfaces like `List`, `Set`, and `Queue`.
- Does not define methods for sorting or accessing elements by index.

### Common Methods

| Method                   | Description                                      |
|--------------------------|--------------------------------------------------|
| `boolean add(E e)`       | Adds an element to the collection.              |
| `boolean remove(Object o)` | Removes a single instance of the specified element. |
| `boolean contains(Object o)` | Checks if the collection contains the specified element. |
| `int size()`             | Returns the number of elements in the collection. |
| `void clear()`           | Removes all elements from the collection.       |
| `boolean isEmpty()`      | Checks if the collection is empty.              |

### Implementation
```java
import java.util.ArrayList;
import java.util.Collection;

Collection<String> collection = new ArrayList<>();
```

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


The `Queue` interface is part of the Java Collection Framework and represents a collection designed for holding elements prior to processing.
- Extends the `Collection` interface.
- Designed for holding elements prior to processing.
- Supports FIFO ordering (in most implementations).
- Provides methods for insertion, removal, and inspection of elements.

### Common Methods

| Method                                | Method                                |
|---------------------------------------|---------------------------------------|
| `boolean add(E e)`                    | `E poll()`                            |
| `boolean offer(E e)`                  | `E peek()`                            |
| `E remove()`                          | `int size()`                          |
| `E element()`                         | `boolean isEmpty()`                   |

### Implementation
```java
import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Sita");
        queue.add("Ram");
        queue.add("Hanuman");
        String frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement); // Sita
        String removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement); // Sita
        queue.offer("Lakshman");
        System.out.println("Queue: " + queue);
    }
}
```

## <a name="priorityqueue">PriorityQueue</a>


The `PriorityQueue` class in Java is part of the Java Collection Framework and represents a priority queue.  It is an unbounded queue based on a priority heap.
- Implements the `Queue` interface.
- Does not permit `null` elements.
- Elements are ordered based on their natural ordering or by a comparator.
- Not thread-safe.

### Common Methods

| Method                                | Method                                |
|---------------------------------------|---------------------------------------|
| `boolean add(E e)`                    | `E poll()`                            |
| `boolean offer(E e)`                  | `E peek()`                            |
| `E remove()`                          | `int size()`                          |
| `E element()`                         | `boolean isEmpty()`                   |

### Implementation
```java
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(1);
        pq.add(3);
        
        System.out.println("PriorityQueue: " + pq);
    }
}
```


## <a name="deque">Deque</a>



The `Deque` (Double Ended Queue) interface is part of the Java Collection Framework and represents a linear collection that supports element insertion and removal at both ends. It extends the `Queue` interface and provides more flexible operations than a regular queue.
- Extends the `Queue` interface.
- Supports insertion and removal at both ends.
- Can be used as a stack (LIFO) or queue (FIFO).
- Does not permit `null` elements.

### Common Methods

| Method                                | Method                                |
|---------------------------------------|---------------------------------------|
| `void addFirst(E e)`                  | `E removeFirst()`                     |
| `void addLast(E e)`                   | `E removeLast()`                      |
| `boolean offerFirst(E e)`             | `E pollFirst()`                       |
| `boolean offerLast(E e)`              | `E pollLast()`                        |
| `E getFirst()`                        | `E peekFirst()`                       |
| `E getLast()`                         | `E peekLast()`                        |
| `boolean isEmpty()`                   | `int size()`                          |


### Implementation
```java
import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Sita");
        deque.addLast("Ram");
        deque.addLast("Hanuman");
        System.out.println("Removed First Element: " + deque.removeFirst());
        System.out.println("Removed Last Element: " + deque.removeLast());
        System.out.println("Deque: " + deque);
    }
}
```


## <a name="map-interface">Map Interface</a>




The `Map` interface is part of the Java Collection Framework and represents a collection of key-value pairs. Each key maps to exactly one value. The `Map` interface is not a subtype of the `Collection` interface and has a different set of methods to manipulate elements.The `Map` interface is implemented by various classes such as `HashMap`, `LinkedHashMap`, and `TreeMap`.
- Maps unique keys to values.
- Does not allow duplicate keys.
- Allows one `null` key and multiple `null` values (implementation-dependent).

### Common Methods

| Method                                | Method                                |
|---------------------------------------|---------------------------------------|
| `V put(K key, V value)`               | `V get(Object key)`                   |
| `V remove(Object key)`                | `boolean containsKey(Object key)`     |
| `boolean containsValue(Object value)` | `int size()`                          |
| `void clear()`                        | `Set<K> keySet()`                     |
| `Collection<V> values()`              | `Set<Map.Entry<K, V>> entrySet()`     |

### Implementation
```java
Map<String, Integer> map = new HashMap<>();
```

## <a name="hashmap">HashMap</a>

The `HashMap` class in Java is part of the Java Collection Framework and implements the `Map` interface. It uses a hash table to store key-value pairs, providing constant-time performance for the basic operations (get and put), assuming the hash function disperses the elements properly among the buckets.
- Implements the `Map` interface.
- Allows `null` values and the `null` key.
- Unordered collection, does not guarantee any specific order of keys.
- Not synchronized, hence not thread-safe.

### Common Methods

| Method                                | Method                                |
|---------------------------------------|---------------------------------------|
| `V put(K key, V value)`               | `V get(Object key)`                   |
| `V remove(Object key)`                | `boolean containsKey(Object key)`     |
| `boolean containsValue(Object value)` | `int size()`                          |
| `void clear()`                        | `Set<K> keySet()`                     |
| `Collection<V> values()`              | `Set<Map.Entry<K, V>> entrySet()`     |

### Implementation
```java
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sita", 21);
        map.put("Ram", 25);
        map.put("Hanuman", 30);
        int age = map.get("Ram");
        System.out.println("Ram's Age: " + age); // 25
        System.out.println("HashMap: " + map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
```

## <a name="treemap">TreeMap</a>



The `TreeMap` class in Java is part of the Java Collection Framework and implements the `NavigableMap` interface. It uses a red-black tree to store key-value pairs, guaranteeing that the map will be in ascending key order, sorted according to the natural ordering of its keys or by a comparator provided at map creation time.
- Implements the `NavigableMap` interface.
- Sorted map, maintains ascending order of keys.
- Allows `null` values but does not permit `null` keys.
- Not synchronized, hence not thread-safe.

### Common Methods

| Method                                | Method                                |
|---------------------------------------|---------------------------------------|
| `V put(K key, V value)`               | `V get(Object key)`                   |
| `V remove(Object key)`                | `boolean containsKey(Object key)`     |
| `boolean containsValue(Object value)` | `int size()`                          |
| `void clear()`                        | `Set<K> keySet()`                     |
| `Collection<V> values()`              | `Set<Map.Entry<K, V>> entrySet()`     |
| `K firstKey()`                        | `K lastKey()`                         |
| `K lowerKey(K key)`                   | `K higherKey(K key)`                  |
| `Map.Entry<K, V> firstEntry()`        | `Map.Entry<K, V> lastEntry()`         |

### Implementation
```java
import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Sita", 21);
        map.put("Ram", 25);
        map.put("Hanuman", 30);
        int age = map.get("Ram");
        System.out.println("Ram's Age: " + age); // 25
        System.out.println("TreeMap: " + map);
    }
}
```

## <a name="iterator">Iterator</a>



The `Iterator` interface is part of the Java Collection Framework and provides a way to traverse a collection, obtain or remove elements. It is a universal iterator as it can be used with any collection, not just lists.
- Supports forward direction traversal.
- Provides methods to check the existence of next elements and to remove elements.
- Simplifies iteration over collections.

### Common Methods

| Method           | Description                                          |
|------------------|------------------------------------------------------|
| `boolean hasNext()` | Returns `true` if the iteration has more elements. |
| `E next()`          | Returns the next element in the iteration.         |
| `void remove()`     | Removes the last element returned by the iterator. |

### Implementation
```java
import java.util.Iterator;

// LinkedList<String> list = new LinkedList<>();
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
  System.out.println(iterator.next());
}

// HashSet<String> set = new HashSet<>();
// TreeSet<String> set = new TreeSet<>();
Iterator<String> iterator = set.iterator();
while (iterator.hasNext()) {
  System.out.println(iterator.next());
}
```

## <a name="listiterator">ListIterator</a>



The `ListIterator` interface extends the `Iterator` interface and provides additional methods for traversing and manipulating lists. It allows bidirectional iteration and provides methods to add, remove, and replace elements.
- Extends the `Iterator` interface.
- Supports bidirectional traversal (both forward and backward).
- Allows modification of the list during iteration.
- Can traverse the list in both directions.

### Common Methods

| Method                                | Description                                          |
|---------------------------------------|------------------------------------------------------|
| `boolean hasNext()`                   | Returns `true` if the iteration has more elements when traversing forward. |
| `E next()`                            | Returns the next element in the iteration.         |
| `boolean hasPrevious()`               | Returns `true` if there are more elements when traversing backward. |
| `E previous()`                        | Returns the previous element in the iteration.     |
| `int nextIndex()`                     | Returns the index of the element that would be returned by `next()`. |
| `int previousIndex()`                 | Returns the index of the element that would be returned by `previous()`. |
| `void remove()`                       | Removes the last element returned by `next()` or `previous()`. |
| `void add(E e)`                       | Inserts the specified element into the list.      |
| `void set(E e)`                       | Replaces the last element returned by `next()` or `previous()` with the specified element. |

### Implementation 
```java
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Create a list
        List<String> list = new ArrayList<>();
        list.add("Sita");
        list.add("Rama");
        list.add("Lakshmana");

        // Get a ListIterator
        ListIterator<String> listIterator = list.listIterator();

        // Traverse the list forward
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println("Forward: " + element);

            // Replace element if it matches "Rama"
            if ("Rama".equals(element)) {
                listIterator.set("Ram");
            }
        }

        // Traverse the list backward
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println("Backward: " + element);

            // Add element before "Sita"
            if ("Sita".equals(element)) {
                listIterator.add("Hanuman");
            }
        }

        System.out.println("List after iteration: " + list);
    }
}
```

## <a name="enumeration">Enumeration</a>



The `Enumeration` interface is a legacy interface from the Java 1.0 and is part of the Java Collection Framework. It provides methods for iterating over a collection of elements, but with fewer capabilities compared to modern iterators such as `Iterator` and `ListIterator`.
- Part of the original Java 1.0.
- Provides methods for basic iteration.
- More limited than modern iterators (`Iterator`, `ListIterator`).

### Common Methods

| Method              | Description                                      |
|---------------------|--------------------------------------------------|
| `boolean hasMoreElements()` | Returns `true` if there are more elements to iterate over. |
| `E nextElement()`           | Returns the next element in the enumeration. |

### Example Usage

```java
import java.util.Vector;
import java.util.Enumeration;

public class EnumerationExample {
    public static void main(String[] args) {
        // Create a Vector (a legacy class that uses Enumeration)
        Vector<String> vector = new Vector<>();
        vector.add("Ram");
        vector.add("Lakshman");
        vector.add("hanuman");

        // Get an Enumeration
        Enumeration<String> enumeration = vector.elements();

        // Iterate over the vector
        while (enumeration.hasMoreElements()) {
            String element = enumeration.nextElement();
            System.out.println("Element: " + element);
        }
    }
}
```

## <a name="comparable">Comparable</a>



The `Comparable` interface in Java is used to define the natural ordering of objects. It allows objects of a class to be compared with each other, which is essential for sorting and ordering operations.
- Defines the natural ordering of objects.
- Used by Java's sorting utilities like `Collections.sort()` and `Arrays.sort()`.
- Enables a class to be compared and sorted based on a specific attribute.

### Common Method

| Method               | Description                                      |
|----------------------|--------------------------------------------------|
| `int compareTo(T o)` | Compares the current object with the specified object. Returns a negative integer, zero, or a positive integer based on the order. |

### Example Usage

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo implements Comparable<ComparableDemo> {
    private String name;
    private int age;

    public ComparableDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(ComparableDemo other) {
        return Integer.compare(this.age, other.age); // Compare by age
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

    public static void main(String[] args) {
        List<ComparableDemo> list = new ArrayList<>();
        list.add(new ComparableDemo("Sita", 25));
        list.add(new ComparableDemo("Ram", 30));
        list.add(new ComparableDemo("Hanuman", 28));

        Collections.sort(list); // Sort the list using the natural ordering defined by compareTo

        System.out.println("Sorted List by Age: " + list);
    }
}
```

## <a name="comparator">Comparator</a>



The `Comparator` interface in Java is used to define custom sorting orders for objects. Unlike the `Comparable` interface, which defines a natural ordering, `Comparator` allows you to specify multiple different ways to compare objects.
- Provides custom sorting logic.
- Can be used to create various sorting orders for the same class.
- Offers flexibility in sorting by allowing different comparison strategies.

### Common Methods

| Method                       | Description                                      |
|------------------------------|--------------------------------------------------|
| `int compare(T o1, T o2)`    | Compares two objects of the same type. Returns a negative integer, zero, or a positive integer based on the order. |
| `boolean equals(Object obj)` | Indicates whether some other object is "equal to" this comparator. |

### Example Usage

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    private String name;
    private int age;

    public ComparatorDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

    // Comparator to sort by name
    public static Comparator<ComparatorDemo> NameComparator = new Comparator<ComparatorDemo>() {
        @Override
        public int compare(ComparatorDemo c1, ComparatorDemo c2) {
            return c1.getName().compareTo(c2.getName()); // Compare by name
        }
    };

    // Comparator to sort by age
    public static Comparator<ComparatorDemo> AgeComparator = new Comparator<ComparatorDemo>() {
        @Override
        public int compare(ComparatorDemo c1, ComparatorDemo c2) {
            return Integer.compare(c1.getAge(), c2.getAge()); // Compare by age
        }
    };

    public static void main(String[] args) {
        List<ComparatorDemo> list = new ArrayList<>();
        list.add(new ComparatorDemo("Sita", 25));
        list.add(new ComparatorDemo("Ram", 30));
        list.add(new ComparatorDemo("Hanuman", 28));

        // Sort by name
        Collections.sort(list, NameComparator);
        System.out.println("Sorted List by Name: " + list);

        // Sort by age
        Collections.sort(list, AgeComparator);
        System.out.println("Sorted List by Age: " + list);
    }
}

```

### Comparing List of Strings
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparatorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sita");
        list.add("Ram");
        list.add("Hanuman");

        // Comparator to sort strings by length
        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length()); // Compare by length
            }
        };

        Collections.sort(list, lengthComparator);
        System.out.println("Sorted List by Length: " + list);
    }
}

``` 
### Comparing List of Integers
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IntegerComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);

        // Comparator to sort integers in descending order
        Comparator<Integer> descendingComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return Integer.compare(i2, i1); // Compare in descending order
            }
        };

        Collections.sort(list, descendingComparator);
        System.out.println("Sorted List in Descending Order: " + list);
    }
}

``` 