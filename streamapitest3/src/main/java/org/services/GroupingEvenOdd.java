package org.services;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingEvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 15, 20, 25, 30);
        Map<String, List<Integer>> partitionEvenOdd = list.stream()
                .collect(Collectors.groupingBy(num -> num % 2 == 0 ? "Even" : "Odd"));
        System.out.println(partitionEvenOdd);
    }
}
