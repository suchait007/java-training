package day1.innerclassesexample;

public class OuterClassAnonymousExample implements Student {

  void someMethod() {

    Student s = new Student() {
      @Override
      public void calculateStudentMarks() {
        System.out.println("Overrided calculate student marks method");
      }
    };

    s.calculateStudentMarks();

  }

  @Override
  public void calculateStudentMarks() {
    System.out.println("Overrided calculate student marks method from outer class");
  }
}
