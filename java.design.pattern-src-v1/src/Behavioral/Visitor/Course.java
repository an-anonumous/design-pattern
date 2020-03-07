package Behavioral.Visitor;

public abstract class Course {
  private String courseName;

  public Course(String courseName) {
    this.courseName = courseName;
  }

  public String getCourseName() {
    return courseName;
  }

  public abstract void accept(Visitor visitor);
}
