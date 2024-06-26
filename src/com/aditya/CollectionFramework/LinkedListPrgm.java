package com.aditya.CollectionFramework;

import java.util.*;

public class LinkedListPrgm {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.add(3,1);
        System.out.println(list);
        System.out.println(list.indexOf(1));
        System.out.println(list.indexOf(0));

        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(10,8,9));
        System.out.println(list1);
        list.addAll(list1);
        System.out.println(list);
        System.out.println(list.get(0)+list.get(3));

        ListIterator lt = list.listIterator();
        while (lt.hasNext()){
            System.out.println(lt.next() + " ");
        }
        while (lt.hasPrevious()){
            System.out.println(lt.previous() + " ");
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
