package Behavioral.Visitor;

public class Student extends Visitor {
  @Override
  public void visit(FreeCourse course) {
    System.out.println("免费学习课程： " + course.getCourseName());
  }

  @Override
  public void visit(ChargeableCourse course) {
    System.out.println("支付" + course.getPrice() + "元; 开始学习" + course.getCourseName());
  }
}
