package day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class HashMapExample {

  public static void main(String[] args) {

    HashMap<Integer, String> hashMap  = new HashMap<>();

    hashMap.put(12, "apple");
    hashMap.put(89, "banana");
    hashMap.put(100, "orange");

    System.out.println(hashMap);

    hashMap.put(89, "banana_updated");

    System.out.println(hashMap);

    System.out.println("-------");

    LinkedHashMap<Integer, String> lMap  = new LinkedHashMap<>();

    lMap.put(12, "apple");
    lMap.put(89, "banana");
    lMap.put(100, "orange");

    System.out.println(lMap);


    System.out.println("-------");

    TreeMap<Integer, String> treeMap = new TreeMap<>();

    treeMap.put(100, "orange");
    treeMap.put(12, "apple");
    treeMap.put(89, "banana");
    treeMap.put(10, "banana11");


    System.out.println(treeMap);


    Queue<String> queue = new LinkedList<>();

    queue.add("t1");
    // 10 45 67 fifo

  }
}
