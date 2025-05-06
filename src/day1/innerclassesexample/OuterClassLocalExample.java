package day1.innerclassesexample;

public class OuterClassLocalExample {

  private int x = 10;
  private String name;

  private static Integer staticX = 10;

  private void xMethod() {
    System.out.println("xMethod");
  }

  public void yMethod() {
    System.out.println("yMethod " + x);
  }

  public void methodA() {

   class LocalClass {

     int x = 1000;

     void localClassMethodExample() {
        System.out.println("LocalClass xMethod" + x);
     }
   }

    LocalClass localClassA = new LocalClass();
    localClassA.localClassMethodExample();

  }
}
