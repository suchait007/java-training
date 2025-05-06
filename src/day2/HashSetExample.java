package day2;

import java.util.HashSet;

public class HashSetExample {

  public static void main(String[] args) {

    HashSet<String> set = new HashSet<>();

    set.add("apple");
    set.add("banana");
    set.add("orange");

    set.add("apple");

    System.out.println(set);

  }
}
