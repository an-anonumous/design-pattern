package Behavioral.Visitor;

public class Test {
  public static void main(String[] args) {
    CourseList courseList = new CourseList();
    courseList.add(new FreeCourse("数据结构"));
    courseList.add(new FreeCourse("java语言程序设计"));
    courseList.add(new FreeCourse("设计模式"));
    courseList.add(new ChargeableCourse("java web开发", 299.0));
    courseList.add(new ChargeableCourse("算法导论", 299.0));
    courseList.add(new ChargeableCourse("机器学习", 299.0));
    courseList.add(new ChargeableCourse("python 开发", 299.0));
    courseList.accept();
  }
}
