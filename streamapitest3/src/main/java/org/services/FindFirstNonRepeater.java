package org.services;

import java.util.*;

public class FindFirstNonRepeater {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(4, 5, 1, 2, 0, 4, 5, 2);
        Optional<Integer> firstNonRepeater = numbersList.stream()
                .filter(num -> Collections.frequency(numbersList, num )==1)
                .findFirst();
        firstNonRepeater.ifPresent(System.out::println);
    }
}
