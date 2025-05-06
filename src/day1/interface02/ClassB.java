package day1.interface02;

public class ClassB implements Flyable, FlywayX {
  @Override
  public void fly() {
    System.out.println("Flying in ClassB");
  }

  @Override
  public void anyMethod()
  {

  }

  @Override
  public void newMethodAddedExample() {
    System.out.println("Default method from ClassB");
  }
}
