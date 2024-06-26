package com.aditya.CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePrgm {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Comparator.reverseOrder());
        pQ.add(1);
        pQ.add(5);
        pQ.add(2);
        pQ.add(9);
        pQ.remove();
        System.out.println(pQ);

        Queue<Integer> q = new PriorityQueue<>(
          new Comparator<Integer>(){
                public int compare(Integer i1,Integer i2){
                    return i2.compareTo(i1);
                }
          });
        q.add(4);
        q.add(1);
        q.add(9);
        q.add(5);
        System.out.println(q);
        q.poll();
        System.out.println(q);
    }
}
