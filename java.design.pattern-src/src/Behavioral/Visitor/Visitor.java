package Behavioral.Visitor;

public abstract class Visitor {

  public abstract void visit(FreeCourse course);

  public abstract void visit(ChargeableCourse course);
}
