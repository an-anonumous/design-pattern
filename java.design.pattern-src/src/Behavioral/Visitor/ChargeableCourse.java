package Behavioral.Visitor;

public class ChargeableCourse extends Course {

  private double price;

  public ChargeableCourse(String courseName, double price) {
    super(courseName);
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
