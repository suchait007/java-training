package day1.innerclassesexample;

public class OuterClassStaticExample {

  private int x = 10;
  private String name;

  private static Integer staticX = 10;

  private void xMethod() {
    System.out.println("xMethod");
  }

  public void yMethod() {
    System.out.println("yMethod " + x);
  }

  private static void xMethod1() {
    System.out.println("xMethod");
  }

  public static void yMethod1() {
    System.out.println("yMethod " + staticX);
  }

  static class InnerClass {

    public void methodA() {
      yMethod1();
    }

  }


}
