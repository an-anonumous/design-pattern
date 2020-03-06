package Behavioral.Command;

public class Test {

  public static void main(String[] args) {
    Course course = new Course("java设计模式");
    Staff staff = new Staff();
    staff.addCommends(new OpenCourseCommand(course));
    staff.addCommends(new CloseCourseCommand(course));
    staff.executeCommands();
  }
}
