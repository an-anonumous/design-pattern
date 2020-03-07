package Behavioral.Observer;

public class Test {
  public static void main(String[] args) {
    Course course = new Course("高等数学");

    course.addObserver(new Teacher("海瑞"));
    course.addObserver(new Teacher("徐阶"));

    course.addQuestion(new Question("熊大", "傅里叶级数", "傅里叶级数期末考吗？"));
  }
}
