package Behavioral.Visitor;

public class FreeCourse extends Course {
  public FreeCourse(String courseName) {
    super(courseName);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
