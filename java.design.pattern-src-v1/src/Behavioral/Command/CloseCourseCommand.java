package Behavioral.Command;

public class CloseCourseCommand implements Icommand {

  private Course course = null;

  public CloseCourseCommand(Course course) {
    this.course = course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  @Override
  public void execute() {
    System.out.println(course.getName() + "\t关闭");
    course.close();
  }
}
