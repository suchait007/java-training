package day1.staticandnonstatic;

public class Student {

  private String name;

  private String address;

  public Student(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public void printDetails() {
    System.out.println("Name : " + this.name + " and address : " + this.address);
  }

}
