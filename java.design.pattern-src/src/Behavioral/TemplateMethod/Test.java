package Behavioral.TemplateMethod;

public class Test {

  public static void main(String[] args) {
    JavaCourse course = new JavaCourse();
    course.makeCourse();

    AlgorithmCourse algorithmCourse = new AlgorithmCourse();
    algorithmCourse.makeCourse();
  }
}
