package day4.streamapis;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppTest {

  public static void main(String[] args) {

    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Apple", "Alex");

    Stream<List<String>> namestream = Stream.of(names);

    Predicate<String> startWithAPredicate = str -> str.startsWith("A");

    List<String> namesWithAList = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());

    System.out.println(namesWithAList);

    List<String> namesWithAList1 = names.stream().filter(startWithAPredicate).collect(Collectors.toList());

    System.out.println(namesWithAList1);

    Predicate<String> predicate1 = name -> name.length() > 3;

    List<String> namewithMorethanFourLength = names.stream().filter(predicate1).collect(Collectors.toList());
    System.out.println(namewithMorethanFourLength);

    Function<String, String> upperCaseFunction = name -> name.toUpperCase();

    List<String> capitalLettersList =
    names.stream()
        .map(name -> name.toUpperCase())
        .collect(Collectors.toList());

    System.out.println(capitalLettersList);

    List<String> capitalLettersList1 =
        names.stream()
            .map(upperCaseFunction)
            .collect(Collectors.toList());

    System.out.println(capitalLettersList1);

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    List<Integer> resultList = numbers.stream().map(number -> number * number).collect(Collectors.toList());

    System.out.println(resultList);

    int allNumbersSum = numbers.stream().reduce(0, (a, b) -> a + b);
    System.out.println(allNumbersSum);

  }
}
