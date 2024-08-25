# Collection Frameworks

## Table of Contents

- [1. Introduction to Collection Framework](#introduction-to-collection-framework)
- [2. List Interface](#list-interface)
  - [2.1 ArrayList](#arraylist)
  - [2.2 LinkedList](#linkedlist)
- [3. Set Interface](#set-interface)
  - [3.1 HashSet](#hashset)
  - [3.2 SortedSet](#sortedset-interface)
  - [3.3 NavigableSet](#navigableset-interface)
  - [3.2 TreeSet](#treeset)
- [4. Vector](#vector)
- [5. Stack](#stack)
- [6. Queue Interface](#queue-interface)
  - [6.1 PriorityQueue](#priorityqueue)
  - [6.2 Deque](#deque-interface)
- [7. Map Interface](#map-interface)
  - [7.1 HashTable](#hashtable)
  - [7.2 HashMap](#hashmap)
  - [7.3 SortedMap](#sortedmap-interface)
  - [7.4 NavigableMap](#navigablemap-interface)
  - [7.5 TreeMap](#treemap)
- [8. Iterable and Comparable](#iterable-and-comparable)
  - [8.1 Iterable](#iterable-interface)
  - [8.2 Iterator](#iterator-interface)
  - [8.3 ListIterator](#listiterator-interface)
  - [8.4 Enumeration](#enumeration-interface)
  - [8.5 Comparable](#comparable-interface)
  - [8.6 Comparator](#comparator-interface)

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

The root interface in the collection hierarchy. A collection represents a group of objects, known as its elements. Some collections allow duplicate elements(like `ArrayList`, `LinkedList` and `Vector`) and others do not(`Set`, `HashSet` and `TreeSet`). Some are ordered(`PriorityQueue` and `Deque`), and others are unordered(`Map Interface`). The JDK does not provide any direct implementations of this interface: it provides implementations of more specific subinterfaces like `Set` and `List`. 

Collections that have a defined encounter order are generally subtypes of the `SequencedCollection` interface.

`SequencedCollection` - A collection that has a well-defined encounter order, that supports operations at both ends, and that is reversible.

- extends the `Iterable` interface.
- Provides basic operations for manipulating collections.
- Serves as the foundation for more specific collection interfaces like `List`, `Set`, and `Queue`.

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

An ordered collection, where the user has precise control over where in the list each element is inserted. The user can access elements by their integer index (position in the list), and search for elements in the list.

The `List` interface is implemented by various classes such as `ArrayList`, `LinkedList`, `Vector`, and `Stack`.
- extends the `SequencedCollection` interface.
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

The `LinkedList` class is the `Doubly-linked list` implementation of the `List` and `Deque` interfaces. Implements all optional list operations, and permits all elements (including `null`).

- extends `AbstractSequentialList`
- implements `List`, `Deque`.
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

A collection that contains no duplicate elements. More formally, sets contain no pair of elements `e1` and `e2` such that `e1.equals(e2)`, and at most one null element. As implied by its name, this interface models the mathematical set abstraction.

The `Set` interface is implemented by various classes such as `HashSet`, `LinkedHashSet`, and `TreeSet`.
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

This class implements the `Set` interface, backed by a hash table (actually a `HashMap` instance). It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time. This class permits the `null` element.

- extends `AbstractSet`
- implements `Set`
- Backed by a hash table (actually a `HashMap` instance).
- Does not allow duplicate elements.
- Provides constant time performance for basic operations like `add`, `remove`, `contains`, and `size`.
- Allows `null` elements.

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

## <a name="sortedset-interface">SortedSet Interface</a>

A `Set` that further provides a total ordering on its elements. The elements are ordered using their <u>natural ordering</u>, or by a `Comparator` typically provided at sorted set creation time. The set's iterator will traverse the set in ascending element order. Several additional operations are provided to take advantage of the ordering. (This interface is the set analogue of `SortedMap`.)

- extends `Set`, `SequencedSet` interface.

## <a name="navigableset-interface">NavigableSet Interface</a>

A `SortedSet` extended with navigation methods reporting closest matches for given search targets. Methods `lower`, `floor`, `ceiling`, and `higher` return elements respectively less than, less than or equal, greater than or equal, and greater than a given element, returning `null` if there is no such element.

- extends `SortedSet` interface.

## <a name="treeset">TreeSet</a>

A `NavigableSet` implementation based on a `TreeMap`. The elements are ordered using their <u>natural ordering</u>, or by a `Comparator` provided at set creation time, depending on which constructor is used.

- extends `AbstractSet`
- implements the `NavigableSet` interface.
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

## <a name="vector">Vector</a>

The `Vector` class implements a growable array of objects. Like an array, it contains components that can be accessed using an integer index. However, the size of a `Vector` can grow or shrink as needed to accommodate adding and removing items after the `Vector` has been created.

- extends `AbstractList`
- implements the `List` interface.
- Vector is synchronized. 

If a thread-safe implementation is not needed, it is recommended to use `ArrayList` in place of `Vector`.

## <a name="stack">Stack</a>

The `Stack` class represents a last-in-first-out (LIFO) stack of objects. It extends class `Vector` with five operations that allow a vector to be treated as a stack. The usual `push` and `pop` operations are provided, as well as a method to `peek` at the top item on the stack, a method to test for whether the stack is `empty`, and a method to `search` the stack for an item and discover how far it is from the top.

- Extends `Vector`.
- Represents a LIFO stack of objects.
- Provides methods to push, pop, peek, and search elements.
- Can store duplicate elements.
- Not synchronized, hence not thread-safe.

> A more complete and consistent set of LIFO stack operations is provided by the `Deque` interface and its implementations, which should be used in preference to this class. For example: 

```java
Deque<Integer> stack = new ArrayDeque<Integer>();
```

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

A collection designed for holding elements prior to processing. Besides basic `Collection` operations, queues provide additional insertion, extraction, and inspection operations. 

Queues typically, but do not necessarily, order elements in a FIFO (first-in-first-out) manner.

- extends the `Collection` interface.
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

An unbounded priority <u>queue based</u> on a priority heap. The elements of the priority queue are ordered according to their <u>natural ordering</u>, or by a `Comparator` provided at queue construction time, depending on which constructor is used.

The `PriorityQueue` class in Java is part of the Java Collection Framework and represents a priority queue.  It is an unbounded queue based on a priority heap.
- implements the `Queue` interface.
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


## <a name="deque-interface">Deque Interface</a>

A linear collection that supports element insertion and removal at both ends. The name deque is short for "double ended queue" and is usually pronounced "deck". 
This interface defines methods to access the elements at both ends of the deque.

- extends the `Queue`, `SequencedCollection` interface.
- Supports insertion and removal at both ends.
- Can be used as a stack (LIFO) or queue (FIFO).
- permits `null`. (But not recommended to do so.)

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

An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
This interface takes the place of the `Dictionary` class, which was a totally abstract class rather than an interface.

The `Map` interface provides three collection views, which allow a map's contents to be viewed as a set of keys, collection of values, or set of key-value mappings.

The `Map` interface is implemented by various classes such as `HashMap`, `LinkedHashMap`, and `TreeMap`.
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

## <a name="hashtable">HashTable</a>

This class implements a hash table, which maps keys to values. Any `non-null` object can be used as a key or as a value.
To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the `hashCode` method and the `equals` method.

*`Object.hashCode()`* - Returns a hash code value for this object. This method is supported for the benefit of hash tables such as those provided by `java.util.HashMap`.

*`Object.equals(Object)`* - Indicates whether some other object is "equal to" this one. 
Returns `true` if this object is the same as the obj argument; `false` otherwise.

An instance of `Hashtable` has two parameters that affect its performance: <i>initial capacity</i>(number of buckets) and <i>load factor</i>.

- extends `Dictionary` abstract class.
- implements `Map` interface.
- Does not allow duplicate keys.
- Allows one `null` key and multiple `null` values (implementation-dependent).

### Implementation
```java
// This example creates a hashtable of numbers. It uses the names of the numbers as keys:
Hashtable<String, Integer> numbers = new Hashtable<String, Integer>(); 
numbers.put("one", 1);
numbers.put("two", 2);
numbers.put("three", 3);

// To retrieve a number, use the following code:
Integer n = numbers.get("two");
if (n != null) {   
    System. out. println("two = " + n);
}
```

## <a name="hashmap">HashMap</a>

Hash table based implementation of the `Map` interface. This implementation provides all of the optional map operations, and permits `null` values and the `null` key. (The `HashMap` class is roughly equivalent to `Hashtable`, except that it is unsynchronized and permits nulls.)

This implementation provides constant-time performance for the basic operations (`get` and `put`), assuming the hash function disperses the elements properly among the buckets.

- extends `AbstractMap` abstarct class.
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

## <a name="sortedmap-interface">SortedMap Interface</a>

A `Map` that further provides a total ordering on its keys. The map is ordered according to the <u>natural ordering</u> of its keys, or by a `Comparator` typically provided at sorted map creation time. This order is reflected when iterating over the sorted map's collection views (returned by the `entrySet`, `keySet` and `values` methods). Several additional operations are provided to take advantage of the ordering. (This interface is the map analogue of `SortedSet`.)

- extends `SequencedMap` interface

## <a name="navigablemap-interface">NavigableMap Interface</a>

A `SortedMap` extended with navigation methods returning the closest matches for given search targets. Methods `lowerEntry`, `floorEntry`, `ceilingEntry`, and `higherEntry` return `Map.Entry` objects associated with keys respectively less than, less than or equal, greater than or equal, and greater than a given key, returning `null` if there is no such key.

- extends `SortedMap` interface.


## <a name="treemap">TreeMap</a>

A Red-Black tree based `NavigableMap` implementation. The map is sorted according to the <u>natural ordering</u> of its keys, or by a `Comparator` provided at map creation time, depending on which constructor is used. 

This implementation provides guaranteed log(n) time cost for the `containsKey`, `get`, `put` and `remove` operations.

- extends `AbstractMap` abstarct class.
- implements the `NavigableMap` interface.
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

## <a name="iterable-interface">Iterable Interface</a>

Implementing this interface allows an object to be the target of the enhanced `for` statement (sometimes called the "for-each loop" statement).


## <a name="iterator-interface">Iterator Interface</a>

An iterator over a collection. `Iterator` takes the place of `Enumeration` in the Java Collections Framework.

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

## <a name="listiterator-interface">ListIterator Interface</a>

An iterator for lists that allows the programmer to traverse the list in either direction, modify the list during iteration, and obtain the iterator's current position in the list. A `ListIterator` has no current element; its cursor position always lies between the element that would be returned by a call to `previous()` and the element that would be returned by a call to `next()`. An iterator for a list of length `n` has `n+1` possible cursor positions, as illustrated by the carets (`^`) below:
                       Element(0)   Element(1)   Element(2)   ... Element(n-1)
  cursor positions:  ^            ^            ^            ^                  ^

- Extends the `Iterator` interface.
- It allows bidirectional iteration and provides methods to add, remove, and replace elements.
- Allows modification of the list during iteration.

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

## <a name="enumeration-interface">Enumeration Interface</a>

An object that implements the Enumeration interface generates a series of elements, one at a time. Successive calls to the `nextElement` method return successive elements of the series.

For example, to print all elements of a `Vector<E>` v:
```java
for (Enumeration<E> e = v. elements(); e. hasMoreElements();)
    System. out. println(e. nextElement());
```

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

## <a name="comparable-interface">Comparable Interface</a>

This interface imposes a total ordering on the objects of each class that implements it. This ordering is referred to as the class's natural ordering, and the class's `compareTo` method is referred to as its natural comparison method.
Lists (and arrays) of objects that implement this interface can be sorted automatically by `Collections.sort` (and `Arrays.sort`). Objects that implement this interface can be used as keys in a <u>sorted map</u> or as elements in a <u>sorted set</u>, without the need to specify a <u>comparator</u>.

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

## <a name="comparator-interface">Comparator Interface</a>

A comparison function, which imposes a total ordering on some collection of objects. Comparators can be passed to a sort method (such as `Collections.sort` or `Arrays.sort`) to allow precise control over the sort order. Comparators can also be used to control the order of certain data structures (such as <u>sorted sets</u> or <u>sorted maps</u>), or to provide an ordering for collections of objects that don't have a <u>natural ordering</u>.
The ordering imposed by a comparator `c` on a set of elements `S` is said to be consistent with equals if and only if `c.compare(e1, e2)==0` has the same boolean value as `e1.equals(e2)` for every `e1` and `e2` in `S`.

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
