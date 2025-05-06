package day4.optional;

import java.util.Optional;

import day4.methodreference.ClassA;

public class AppTest {

  public static void main(String[] args) {

    String s = null;
    //System.out.println(s.length());

    Optional<String> optionalString = Optional.ofNullable(s);

    ClassA classA = new ClassA("test");

    Optional.ofNullable(classA);

    /*
    if(optional.isPresent()) {
      String value = optional.get();
      System.out.println("Value Present");
    }

     */

    optionalString.ifPresent(name -> System.out.println(name.length()));

    System.out.println("-----");

    optionalString.ifPresentOrElse(name -> System.out.println(name.length()),
        () -> System.out.println("String is null"));

    optionalString.map(String::toUpperCase);


  }
}
