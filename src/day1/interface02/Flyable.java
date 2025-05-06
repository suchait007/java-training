package day1.interface02;

public interface Flyable {

  String name = "x";

  String name1 = "anyname";

  Integer x = 10;

  void fly();

  default void newMethodAddedExample(){
    System.out.println("newMethodAddedExample in Interface");
  }

}
