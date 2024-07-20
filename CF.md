# Collection Frameworks

## Table of Contents

- [1. Introduction to Collection Framework](#introduction-to-collection-framework)
- [2. List Interface](#list-interface)
  - [2.1 ArrayList](#arraylist)
  - [2.2 LinkedList](#linkedlist)
- [3. Set Interface](#set-interface)
  - [3.1 HashSet](#hashset)
  - [3.2 TreeSet](#treeset)
- [4. Queue Interface](#queue-interface)
  - [4.1 PriorityQueue](#priorityqueue)
  - [4.2 LinkedList as Queue](#linkedlist-as-queue)
- [5. Map Interface](#map-interface)
  - [5.1 HashMap](#hashmap)
  - [5.2 TreeMap](#treemap)
- [6. Iterators and Comparators](#iterators-and-comparators)
  - [6.1 Iterator](#iterator)
  - [6.2 ListIterator](#listiterator)
  - [6.3 Enumeration](#enumeration)
  - [6.4 Comparable](#comparable)
  - [6.5 Comparator](#comparator)

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


- It is mostly used collection type.
- List is a child interface of Collection.
- It represents a group of objects as a single entity with the following conditions:
  - **Duplicates are allowed**
  - **Insertion order is preserved**

Users can add elements at a particular index number.

A special iterator, called a `ListIterator`, is used to traverse the elements

## <a name="arraylist">ArrayList in Java</a>
 
![alt](/images/arraylist.png)

## <a name="set-interface">Set Interface</a>


- It is a child interface of Collection.
- Represents a group of objects as a single entity with the condition that:
  - **Duplicates are not allowed**
  - **Insertion order is not preserved**

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
