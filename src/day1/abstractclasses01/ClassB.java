package day1.abstractclasses01;

public abstract class ClassB {

  String name; // instance variable

  ClassB(String name) {
    this.name = name;
  }

  public abstract int area(int x, int y);

  public void anyMethod() {
    System.out.println("This is a method in ClassB");
  }
}
