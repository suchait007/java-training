package day3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {

  public static void main(String[] args) {

    /*
    Runnable task = new Runnable() {
      @Override
      public void run() {
        System.out.println("Thread running :  " + Thread.currentThread().getName());
      }
    };

    ExecutorService executorService = Executors.newFixedThreadPool(4);

    for(int i = 0; i < 50; i++) {
      executorService.submit(task);
    }

    executorService.shutdown();
    */

    System.out.println("------");

    ExecutorService executorService = Executors.newFixedThreadPool(4);
    //async operation
    Future<String> result = executorService.submit(new MyCallableTask());

    try {

      System.out.println("Value of future : " + result.get());

    } catch (Exception e) {
      System.out.println("Error in getting future value");
    } finally {
      executorService.shutdown();
    }



  }
}
