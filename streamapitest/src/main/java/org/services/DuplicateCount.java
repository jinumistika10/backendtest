package org.services;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCount {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> counts = names.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("Elements with count: " + counts);
    }
}
