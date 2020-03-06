package Structural.Decorator;

public class Cake extends AbstractCake {
  @Override
  public String getDesc() {
    return "蛋糕";
  }

  @Override
  public double getPrice() {
    return 100;
  }
}
