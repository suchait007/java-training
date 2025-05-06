package day4.functionalinterface;

public class AppTest {
  public static void main(String[] args) {

    Calculate sum = (int a, int b) -> a + b;

    System.out.println(sum.operate(10, 8));

    Calculate subtract = (int a, int b) -> a - b;

    Calculate multiply = (int a, int b) -> a * b;

    System.out.println(subtract.operate(10, 8));
    System.out.println(multiply.operate(10, 8));

  }
}
