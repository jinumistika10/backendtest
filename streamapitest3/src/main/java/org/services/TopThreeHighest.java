package org.services;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TopThreeHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 80, 45, 60, 30, 90, 20);
        Stream<Integer> topThreeHighest = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3);
        topThreeHighest.forEach(System.out::println);
    }
}
