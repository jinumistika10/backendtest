package org.services;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 45, 67, 23, 89, 54, 89);
        Optional<Integer> secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        secondHighest.ifPresent(System.out::println);
//        System.out.println("Second Highest :"+" "+secondHighest);
    }
}
