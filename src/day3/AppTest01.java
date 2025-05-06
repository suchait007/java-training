package day3;

public class AppTest01 {

  public static void main(String[] args) throws InterruptedException {

    System.out.println("Thread currently executing : " + Thread.currentThread().getName());

    Thread t1 = new Thread(new RunnableTask());
    t1.start();

    t1.join();

    Thread t2 = new Thread(new RunnableTask());
    t2.start();

    t2.join();

    System.out.println("Thread currently executing : " + Thread.currentThread().getName());

  }
}
