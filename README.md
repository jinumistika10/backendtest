# Stream Api Test 
## Description
This project contains some basic programs created using Java Stream API. I created these programs to practice stream functions and understand how they work using real examples. Each program performs different operations like filtering numbers, finding duplicates, sorting values, and mapping data. The programs are simple and easy to understand.
## Flow of Task
  - First I created a package named org.services.
  - Then I created separate classes for each problem.
  - After that I added sample inputs.
  - Next I used Java Stream methods to perform operations.
  - Finally I printed outputs in console and verified results.
## Functionalities
### 1. Find Even Numbers
numbers.stream()
       .filter(n -> n % 2 == 0)
       .forEach(System.out::println);
### 2. Find Duplicate Numbers
Set<Integer> uniqueNumbers = new HashSet<>();

Set<Integer> duplicates = duplicateNumbers.stream()
        .filter(number -> !uniqueNumbers.add(number))
        .collect(Collectors.toSet());
### 3. Descending Order Sort
List<Integer> reversed = numbers.stream()
        .sorted(Comparator.reverseOrder())
        .toList();
### 4. Distinct Elements
List<Integer> distinctNum = numbers.stream()
        .distinct()
        .toList();
### 5. Duplicate Count
Map<String, Long> counts = names.stream()
        .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
### 6. Name Length Mapping
List<Integer> lengths = names.stream()
        .map(name -> name.length())
        .toList();
