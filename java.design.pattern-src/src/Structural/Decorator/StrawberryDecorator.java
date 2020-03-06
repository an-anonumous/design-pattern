package Structural.Decorator;

public class StrawberryDecorator extends AbstarctDecorator {
  public StrawberryDecorator(AbstractCake cake) {
    super(cake);
  }

  @Override
  public String getDesc() {
    return cake.getDesc() + "+草莓";
  }

  @Override
  public double getPrice() {
    return cake.getPrice() + 20;
  }
}
