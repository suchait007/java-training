package day3;

public class AppTest {

  public static void main(String[] args) {

    System.out.println("Thread currently executing : " + Thread.currentThread().getName());

    ThreadExample thread1 = new ThreadExample();

    thread1.start();

    ThreadExample thread2 = new ThreadExample();

    thread2.start();

  }

}
