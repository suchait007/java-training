package day3;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionsExample {

  public static void main(String[] args) {

    ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

    concurrentHashMap.put("t1",123);

    CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

    list.add("s1");

  }
}
