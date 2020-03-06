package Behavioral.StrategyPattern;

public class FullreductionStrategy implements PromotionStrategy {
  @Override
  public double doPromotion(double price) {
    if (price > 200) {
      return 200 - 30;
    }
    return price;
  }
}
