package day1.abstractclasses01;

public class Square extends ClassB {
  Square(String name) {
    super(name);
  }

  @Override
  public int area(int x, int y) {
    return x*y;
  }
}
