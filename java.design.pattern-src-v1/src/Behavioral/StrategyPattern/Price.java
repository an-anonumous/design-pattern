package Behavioral.StrategyPattern;

public class Price {

  private double price;
  private PromotionStrategy strategy;

  public Price(double price, PromotionStrategy strategy) {
    this.price = price;
    this.strategy = strategy;
  }

  public double getUltimatePrice() {
    return strategy.doPromotion(price);
  }
}
