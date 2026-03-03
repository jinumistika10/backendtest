package org.services;

import java.util.Arrays;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> list2 = Arrays.asList(30, 40, 60, 70);
        List<Integer> commonInteger = list1.stream()
                .filter(list2::contains)
                .toList();
        System.out.println(commonInteger);
    }
}
