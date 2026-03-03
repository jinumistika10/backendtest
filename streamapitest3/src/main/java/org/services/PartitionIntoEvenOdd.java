package org.services;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionIntoEvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        Map<Boolean, List<Integer>> result = list.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println("Even Numbers : " + result.get(true));
        System.out.println("Odd Numbers  : " + result.get(false));
    }
}
