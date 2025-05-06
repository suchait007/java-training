package day1.interface02;

public class AppTest {

  public static void main(String[] args) {

    Flyable flyable = new ClassA();

    flyable.fly();

    Flyable classb = new ClassB();

    classb.fly();

  }
}
