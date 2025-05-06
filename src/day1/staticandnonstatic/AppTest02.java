package day1.staticandnonstatic;

public class AppTest02 {

  public static void main(String[] args)
  {

    Student s = new Student("suchait", "anything");
    s.printDetails();

    Student2 s2 = new Student2("suchait2", "anything");
    s2.printDetails2();


    //System.out.println(Student2.rollNumber);

    System.out.println(s2.getRollNumber());

    Student2.thisIsStatic();

    if("anything".equalsIgnoreCase(StudentConstant.studentName)) {
      //
    }

    System.out.println(StudentConstant.studentName);

  }
}
