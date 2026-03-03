package org.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerStartsWithOne {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 23, 11, 45, 19, 30);
        List<Integer> integerStartingWithOne = list.stream()
                .filter(num -> String.valueOf(num).startsWith("1"))
                .toList();
        System.out.println(integerStartingWithOne);
    }
}
