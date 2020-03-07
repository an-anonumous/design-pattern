package Structural.Decorator;

public class CandleDecorator extends AbstarctDecorator {
  public CandleDecorator(AbstractCake cake) {
    super(cake);
  }

  @Override
  public String getDesc() {
    return cake.getDesc() + "+ 蜡烛";
  }

  @Override
  public double getPrice() {
    return cake.getPrice() + 10;
  }
}
