package org.services;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiTest {
    public static void main(String[] args) {

        // 1. Find Second Highest
        System.out.println("1. Second Highest Number");
        List<Integer> list = Arrays.asList(10, 45, 67, 23, 89, 54, 89);
        Optional<Integer> secondHighest = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        secondHighest.ifPresent(System.out::println);
        System.out.println();

        // 2. Find First Non-Repeated Number
        System.out.println("2. First Non-Repeated Number");
        List<Integer> list1 = Arrays.asList(4, 5, 1, 2, 0, 4, 5, 2);
        Optional<Integer> nonRepeatedNum = list1.stream()
                .filter(num -> Collections.frequency(list1,num)==1)
                .findFirst();
        nonRepeatedNum.ifPresent(System.out::println);
        System.out.println();

        // 3. Find Duplicate Numbers
        System.out.println("3. Duplicate Numbers");
        List<Integer> list2 = Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = list2.stream()
                .filter(num -> !seen.add(num))
                .distinct()
                .toList();
        System.out.println(result);
        System.out.println();

        // 4. Count Frequency of Each Number
        System.out.println("4. Count Frequency Of Each Number");
        List<Integer> list3 = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 1);
        list3.stream()
                .distinct()
                .forEach(num -> System.out.println(num + " : "+ Collections.frequency(list3, num)));
        System.out.println();

        // 5. Find Top 3 Highest Numbers
        System.out.println("5. Top 3 Highest Numbers");
        List<Integer> list4 = Arrays.asList(10, 80, 45, 60, 30, 90, 20);
        List<Integer> topThreeHighest = list4.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(topThreeHighest);
        System.out.println();

        // 6. Partition Numbers into Even and Odd
        System.out.println("6. Partitioning Numbers Into Even And Odd");
        List<Integer> list5 = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        Map<Boolean, List<Integer>> partitioningNumbers = list5.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println("Even :" + " " + partitioningNumbers.get(true));
        System.out.println("Odd :" + " " + partitioningNumbers.get(false));
        System.out.println();

        // 7. Find Numbers Starting With Digit 1
        System.out.println("7. Numbers Starting With Digit 1");
        List<Integer> list6 = Arrays.asList(10, 15, 23, 11, 45, 19, 30);
        List<Integer> integerList = list6.stream()
                .filter(numb -> String.valueOf(numb).startsWith("1"))
                .toList();
        System.out.println(integerList);
        System.out.println();

        // 8. Find Common Elements Between Two Lists
        System.out.println("8. Common Elements Between Two Lists");
        List<Integer> numberList1 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> numberList2 = Arrays.asList(30, 40, 60, 70);
        List<Integer> commonElements = numberList1.stream()
                .filter(numberList2::contains)
                .toList();
        System.out.println(commonElements);
        System.out.println();

        // 9. Group Numbers by Even and Odd
        System.out.println("9. Group Numbers By Even And Odd");
        List<Integer> list7 = Arrays.asList(5 ,10, 15, 20, 25, 30);
        Map<String, List<Integer>> groupingNumbers = list7.stream()
                .collect(Collectors.groupingBy(num -> num % 2 == 0 ? "Even" : "Odd"));
        System.out.println(groupingNumbers);
        System.out.println();

        //10. Find Sum of Squares of Even Numbers
        System.out.println("10. Sum of Squares of Even Numbers");
        List<Integer> list8 = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sumOfSquares = list8.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .reduce(0, Integer::sum);
        System.out.println(sumOfSquares);

    }
}
