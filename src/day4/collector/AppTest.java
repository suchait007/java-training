package day4.collector;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AppTest {

  public static void main(String[] args) {

    List<String> fruits = Arrays.asList("apple", "banana", "orange", "kiwi", "grape", "apple", "banana");

    String joinedString = fruits.stream().collect(Collectors.joining(","));

    System.out.println(joinedString);


    Map<Character, Long> groupingByLength = fruits.stream()
        .collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.counting()));

    Set<String> uniqueFruits = fruits.stream().collect(Collectors.toSet());

    System.out.println(uniqueFruits);


  }
}
