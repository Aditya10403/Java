package com.aditya.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    private int age;
    private String name;

    public ComparatorDemo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return age + " " + name;
    }

    public static Comparator<ComparatorDemo> AgeAscComparator = new Comparator<ComparatorDemo>() {
        @Override
        public int compare(ComparatorDemo o1, ComparatorDemo o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    };

    public static Comparator<ComparatorDemo> AgeDescComparator = new Comparator<ComparatorDemo>() {
        @Override
        public int compare(ComparatorDemo o1, ComparatorDemo o2) {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
    };

    public static Comparator<ComparatorDemo> NameAscComparator = new Comparator<ComparatorDemo>() {
        @Override
        public int compare(ComparatorDemo o1, ComparatorDemo o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<ComparatorDemo> NameDescComparator = new Comparator<ComparatorDemo>() {
        @Override
        public int compare(ComparatorDemo o1, ComparatorDemo o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };

    /**
     * <pre>
     *     {@code
     *     public static Comparator<ComparatorDemo> AgeAscComparator = (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge());
     *
     *     public static Comparator<ComparatorDemo> AgeDescComparator = (o1, o2) -> Integer.compare(o2.getAge(), o1.getAge());
     *
     *     public static Comparator<ComparatorDemo> NameAscComparator = ((o1, o2) -> o1.getName().compareTo(o2.getName()));
     *
     *     public static Comparator<ComparatorDemo> NameDescComparator = ((o1, o2) -> o2.getName().compareTo(o1.getName()));
     *     }</pre>
     */

    public static void main(String[] args) {
        List<ComparatorDemo> list = new ArrayList<>();
        list.add(new ComparatorDemo(30, "Ram"));
        list.add(new ComparatorDemo(27, "Lakshman"));
        list.add(new ComparatorDemo(25, "Sita"));
        list.add(new ComparatorDemo(28, "Hanuman"));

        // Sort by age ASC
        list.sort(AgeAscComparator);
        System.out.println("Sorted List by Age asc: " + list);

        // Sort by age DESC
        list.sort(AgeDescComparator);
        System.out.println("Sorted List by Age desc: " + list);

        // Sort by name ASC
        list.sort(NameAscComparator);
        System.out.println("Sorted List by Name asc: " + list);

        // Sort by name DESC
        list.sort(NameDescComparator);
        System.out.println("Sorted List by Name desc: " + list);


    }
}
