package day3;

import java.util.concurrent.Callable;

public class MyCallableTask implements Callable<String> {
  @Override
  public String call() throws Exception {

    System.out.println("Current thread is running : " + Thread.currentThread().getName());

    return "anything-value";
  }
}
