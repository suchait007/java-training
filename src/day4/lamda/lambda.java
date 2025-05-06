package day4.lamda;

import java.util.Arrays;
import java.util.List;

public class lambda {

  public static void main(String[] args) {

    Runnable runnable = () -> System.out.println("Currently thread is running : " + Thread.currentThread().getName());

    //Thread thread = new Thread(runnable);
    //thread.start();

    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");


    names.forEach(name -> System.out.println(name));

  }
}
