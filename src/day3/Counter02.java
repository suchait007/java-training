package day3;

public class Counter02 {

  private int counter = 0;

  public synchronized void incrementCounter() {
    counter++;
  }

  public void incrementCounter1() {
    synchronized (this){
      counter++;
    }

    ///
    ////
    ///
    //
    //

    synchronized (this) {
      System.out.println("Again locked");
    }
  }

  public synchronized int getCounter() {
    return counter;
  }
}
