package Behavioral.TemplateMethod;

public class JavaCourse extends AbstractCourse {
  @Override
  protected void additionalOperation() {
    System.out.println("打包课程源码");
  }
}
