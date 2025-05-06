package day3;

public class ThreadExample extends Thread {

  @Override
  public void run() {
    System.out.println("Thread is running : " + Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
  }
}
