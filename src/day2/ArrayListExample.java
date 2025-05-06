package day2;

import java.util.ArrayList;

public class ArrayListExample {

  public static void main(String[] args) {


    ArrayList<String> list11 = new ArrayList<>(100);

    ArrayList<String> list1 = new ArrayList<>();

    //a[0] = 1

    list1.add("apple");
    list1.add("banana");
    list1.add("orange");

    System.out.println(list1.get(0));


    list1.remove("banana");

    System.out.println(list1);


  }
}
