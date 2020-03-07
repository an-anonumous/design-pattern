package Behavioral.StrategyPattern;

public class Test {
  public static void main(String[] args) {
    Price price = new Price(280, new FullreductionStrategy());
    System.out.println(price.getUltimatePrice());

    price = new Price(280, new DiscountStrategy());
    System.out.println(price.getUltimatePrice());
  }
}
