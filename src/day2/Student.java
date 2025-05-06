package day2;

import java.util.Objects;

public class Student {

  private String name;
  private String rollNumber;


  @Override
  public boolean equals(Object o) {
    if (this == o)
    {
      return true;
    }
    if (o == null || getClass() != o.getClass())
    {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(name, student.name) && Objects.equals(rollNumber,
        student.rollNumber);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(name, rollNumber);
  }
}
