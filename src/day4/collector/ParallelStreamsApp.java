package day4.collector;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamsApp {

  public static void main(String[] args) {

    List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

    long start = System.currentTimeMillis();
    fruits.stream().forEach(fruit -> System.out.println(fruit + " processed by [" + Thread.currentThread().getName() + "]"));
    long end = System.currentTimeMillis();

    System.out.println("Time taken in sequential stream: " + (end - start) + " ms");

    System.out.println("------");

    long start1 = System.currentTimeMillis();
    fruits.parallelStream().forEach(fruit -> System.out.println(fruit + " processed by " + Thread.currentThread().getName()));
    long end1 = System.currentTimeMillis();

    System.out.println("Time taken in parallel stream: " + (end1 - start1) + " ms");

  }
}
