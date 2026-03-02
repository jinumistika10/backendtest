package org.services;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DecendingIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> reversed = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(reversed);
    }
}
