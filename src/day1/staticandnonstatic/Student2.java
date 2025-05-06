package day1.staticandnonstatic;

public class Student2
{

  private String name;
  private String address;
  private static String rollNumber = "1234567890";




  public Student2(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public void printDetails2() {
    System.out.println("Name : " + this.name + " and address : " + this.address);
  }

  public String getRollNumber() {
    return rollNumber;
  }

  public static void thisIsStatic() {
    System.out.println("This is static method");
  }


}
