package Behavioral.Command;

public class OpenCourseCommand implements Icommand {

  private Course course = null;

  public OpenCourseCommand(Course course) {
    this.course = course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  @Override
  public void execute() {
    System.out.println(course.getName() + "\t打开");
    course.open();
  }
}
