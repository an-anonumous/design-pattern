package Structural.Decorator;

/** 抽象装饰者类 */
public abstract class AbstarctDecorator extends AbstractCake {
  protected AbstractCake cake;

  public AbstarctDecorator(AbstractCake cake) {
    this.cake = cake;
  }
}
