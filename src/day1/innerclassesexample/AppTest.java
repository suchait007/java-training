package day1.innerclassesexample;

public class AppTest {

  public static void main(String[] args) {

    OuterClass outerClassA = new OuterClass();

    outerClassA.yMethod();


    System.out.println("-------------------");

    OuterClass.InnerClass innerClassA = new OuterClass().new InnerClass();

    innerClassA.innerXMethod();


    innerClassA.callOuterClassMethod();

  }
}
