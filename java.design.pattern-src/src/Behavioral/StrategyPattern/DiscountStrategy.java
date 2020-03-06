package Behavioral.StrategyPattern;

public class DiscountStrategy implements PromotionStrategy {
  @Override
  public double doPromotion(double price) {
    return 0.8 * price;
  }
}
