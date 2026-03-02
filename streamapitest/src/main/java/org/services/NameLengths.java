package org.services;

import java.util.Arrays;
import java.util.List;

public class NameLengths {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        List<Integer> lengths = names.stream()
                .map(name -> name.length())
                .toList();
        System.out.println(lengths);
    }
}
