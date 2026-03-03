package org.services;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountFrequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 1);
        list.stream()
                .distinct()
                .forEach(num -> System.out.println(num + " : " + Collections.frequency(list, num)));
    }
}
