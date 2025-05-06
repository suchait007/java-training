package day3;

public class SynchronizedExample {

  public static void main(String[] args) throws InterruptedException
  {

    Counter02 counter = new Counter02();

    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {

        for(int i = 0; i < 100; i++) {
          counter.incrementCounter();
        }

      }
    });


    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {

        for(int i = 0; i < 100; i++) {
          counter.incrementCounter();
        }

      }
    });


    Thread t3 = new Thread(new Runnable() {
      @Override
      public void run() {

        for(int i = 0; i < 100; i++) {
          counter.incrementCounter();
        }

      }
    });


    t1.start();

    t2.start();
    t3.start();

    t1.join();
    t2.join();
    t3.join();

    System.out.println("Value : " + counter.getCounter());


  }

}
