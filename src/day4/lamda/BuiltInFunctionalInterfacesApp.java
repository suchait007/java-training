package day4.lamda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfacesApp {

  public static void main(String[] args) {

    //apple

    //name -> name.startsWith("A")
    Predicate<String> emptyStringPredicate = s -> s.isEmpty();

    System.out.println(emptyStringPredicate.test("apple"));
    System.out.println(emptyStringPredicate.test(""));

    System.out.println("------");

    BiFunction<String, String, String> stringConcatFunction = (s1, s2) -> s1.concat(s2);
    System.out.println(stringConcatFunction.apply("apple", "mango"));

    BiFunction<Integer, Integer, Integer> sumFunction = (a, b) -> a + b;

    Predicate<Integer> isEvenPredicate = i -> i % 2 == 0;
    System.out.println(isEvenPredicate.test(10));
    System.out.println(isEvenPredicate.test(11));

    System.out.println("------");

    BiPredicate<String, String> stringEqualityPredicate = (s1, s2) -> s1.equals(s2);

    System.out.println(stringEqualityPredicate.test("apple", "apple"));
    System.out.println(stringEqualityPredicate.test("apple", "mango"));

    System.out.println("------");


    Function<String, Integer> stringLengthFunction = s -> s.length();
    System.out.println(stringLengthFunction.apply("apple"));


    System.out.println("-------");

    Consumer<String> printConsumer = s -> System.out.println(s);
    printConsumer.accept("Hello, World!");

    BiConsumer<String, Integer> printEntryConsumer = (key, value) -> {
      System.out.println("Key: " + key);
      System.out.println("Value: " + value);
    };

    Consumer<String> stringConsumer1 = s -> s.length();

    stringConsumer1.accept("test");

    System.out.println("----");

    Supplier<Double> randomSupplier = () -> Math.random();

    System.out.println(randomSupplier.get());


  }
}
