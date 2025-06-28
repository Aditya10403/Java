package com.aditya.Java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        int[] nums = { 2, 4, 5, 7, 9, 6 };
//        int sum = Arrays.stream(nums).filter(x -> x % 2 == 0).sum();
//        System.out.println(sum);

        List<Integer> nums = Arrays.asList(2, 4, 5, 7, 9, 6);
        Stream<Integer> allStream = nums.stream();
        Stream<Integer> evenStream = nums.stream();
        List<Integer> allSquares = allStream.map(num -> num * num).collect(Collectors.toList());
        List<Integer> evenSquares = evenStream.filter(num -> num % 2 == 0).map(num -> num * num).collect(Collectors.toList());
        System.out.println(allSquares);
        System.out.println(evenSquares);

        List<Integer> list = Stream
                .iterate(0, x -> x + 1)
                .limit(101)
                .skip(1)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((x, y) -> y - x)
                .peek(System.out::println)
                .toList();

    }
}
