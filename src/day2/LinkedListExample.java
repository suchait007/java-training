package day2;

import java.util.LinkedList;

public class LinkedListExample {

  public static void main(String[] args) {

    LinkedList<String> list1 = new LinkedList<>();

    list1.add("apple");
    list1.add("banana");
    list1.add("orange");

    System.out.println(list1);

    list1.addFirst("first_element");
    list1.addLast("last_element");

    System.out.println(list1);


    list1.remove("banana");

    list1.add("apple") ;


    System.out.println(list1);

  }
}
