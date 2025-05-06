package day1.abstractclasses01;

public class Rectangle extends ClassB {
  Rectangle(String name)
  {
    super(name);
  }

  @Override
  public int area(int x, int y)
  {
    return x + y;
  }
}
