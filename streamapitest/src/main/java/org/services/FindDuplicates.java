package org.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> duplicateNumbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> findDuplicateNumbers = duplicateNumbers.stream()
                .filter(number->!uniqueNumbers.add(number))
                .collect(Collectors.toSet());
        System.out.println(findDuplicateNumbers);
    }
}
