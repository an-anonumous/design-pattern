package Behavioral.Visitor;

public class Teacher extends Visitor {
  @Override
  public void visit(FreeCourse course) {
    System.out.println("答疑");
  }

  @Override
  public void visit(ChargeableCourse course) {
    System.out.println("答疑;\t统计收益");
  }
}
