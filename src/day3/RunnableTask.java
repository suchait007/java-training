package day3;

public class RunnableTask implements Runnable{
  @Override
  public void run() {
    System.out.println("Thread is running : " + Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
  }
}
