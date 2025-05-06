package day3;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

  public static String m1() {
    System.out.println("method m1()");
    return "something";
  }

  public static void main(String[] args) {


    Runnable task = new Runnable() {
      @Override
      public void run() {
        System.out.println("Thread running :  " + Thread.currentThread().getName());
      }
    };

    CompletableFuture.runAsync(task);


    CompletableFuture.runAsync(() -> m1());

    CompletableFuture.supplyAsync(() -> m1());

  }
}
