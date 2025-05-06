package day4.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppTest {

  public static void main(String[] args) {

    List<String> names1 = Arrays.asList("java", "python", "go");

    List<Integer> resultNums = names1.stream().map(name -> name.length()).collect(Collectors.toList());

    System.out.println(resultNums);

    List<Integer> resultNums1 = names1.stream().map(String::length).collect(Collectors.toList());

    System.out.println(resultNums1);

    List<ClassA> classAList = List.of(new ClassA("Amit"), new ClassA("Anil"), new ClassA("John"));

    List<String> result = classAList.stream().map(ClassA::getName).collect(Collectors.toList());

    System.out.println(result);

  }
}
