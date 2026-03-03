package org.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> duplicateNumbers = Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = duplicateNumbers.stream()
                .filter(num -> !seen.add(num))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(duplicates);

//        Set<Integer> uniqueNumbers = new HashSet<>();
//        Set<Integer> findDuplicateNumbers = duplicateNumbers.stream()
//                .filter(number->!uniqueNumbers.add(number))
//                .collect(Collectors.toSet());
//        System.out.println(findDuplicateNumbers);
    }
}
