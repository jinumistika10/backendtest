# Stream Api Test - 3
## 1) Find Second Highest Number

### Description:
In this program, I find the second highest number from the list.

### Functions Used:

**distinct()** – to remove duplicate numbers

**sorted(Comparator.reverseOrder())** – to sort numbers in descending order

**skip(1)** – to skip the first highest number

**findFirst()** – to get the second highest number

## 2) Find First Non-Repeated Number

### Description:
In this program, I find the first number that appears only one time.

### Functions Used:

**filter()** – to check numbers

**Collections.frequency()** – to count how many times a number appears

**findFirst()** – to get the first matching number

## 3) Find Duplicate Numbers

### Description:
In this program, I print all duplicate numbers from the list.

### Functions Used:

**HashSet** – to store unique numbers

**add()** – to check if number is already present

**filter()** – to select duplicate numbers

**distinct()** – to avoid repeating duplicates

**collect()** – to store result in list

## 4) Count Frequency of Each Number

### Description:
In this program, I count how many times each number appears.

### Functions Used:

**distinct()** – to get unique numbers

**Collections.frequency()** – to count occurrences

**forEach()** – to print each number with its count

## 5) Find Top 3 Highest Numbers

### Description:
In this program, I find the top 3 highest numbers.

### Functions Used:

**distinct()** – to remove duplicates

**sorted(Comparator.reverseOrder())** – to sort in descending order

**limit(3)** – to get first 3 numbers

**forEach()** – to print them

## 6) Partition Numbers into Even and Odd

### Description:
In this program, I separate numbers into even and odd groups.

### Functions Used:

**Collectors.partitioningBy()** – to divide numbers into two groups

Condition num % 2 == 0 – to check even numbers

## 7) Find Numbers Starting With Digit 1

### Description:
In this program, I find numbers that start with digit 1.

### Functions Used:

**String.valueOf()** – to convert number to string

**startsWith("1")** – to check first digit

**filter(**) – to select matching numbers

## 8) Find Common Elements Between Two Lists

### Description:
In this program, I find common numbers between two lists.

### Functions Used:

**stream()** – to start stream

**filter()** – to check condition

**contains()** – to check if number is in second list

**toList()** – to collect result

## 9) Group Numbers by Even and Odd

### Description:
In this program, I group numbers into even and odd.

### Functions Used:

**Collectors.groupingBy()** – to group numbers

Condition num % 2 == 0 ? "Even" : "Odd" – to decide group

## 10) Find Sum of Squares of Even Numbers

### Description:
In this program, I find the sum of squares of even numbers.

### Functions Used:

**filter()** – to get even numbers

**map()** – to square each number

**reduce()** – to add all values
