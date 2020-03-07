package Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CourseList {
  List<Course> list = new ArrayList<>();

  public void add(Course course) {
    list.add(course);
  }

  public void accept() {
    for (Course c : list) {
      c.accept(new Student());
    }
    System.out.println("==============================================\n");
    for (Course c : list) {
      c.accept(new Teacher());
    }
  }
}
