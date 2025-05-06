package day1.innerclassesexample;

public class OuterClass {

  private int x = 10;
  private String name;

  private void xMethod() {
    System.out.println("xMethod");
  }

  public void yMethod() {
    System.out.println("yMethod " + x);
  }

  class InnerClass {

    public void innerXMethod() {
      x = 100;
      System.out.println("innerXMethod " + x);
    }

    public void callOuterClassMethod() {
      yMethod(); //public
      xMethod(); //private
    }

  }

}
