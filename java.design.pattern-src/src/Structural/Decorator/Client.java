package Structural.Decorator;

public class Client {
  public static void main(String[] args) {
    //    Cake cake = new Cake();
    //    CandleDecorator candleCake = new CandleDecorator(cake);
    //    StrawberryDecorator strawberryCandleCake = new StrawberryDecorator(candleCake);
    //    StrawberryDecorator strawberryCandleCake2 = new StrawberryDecorator(strawberryCandleCake);
    //
    //    System.out.println(strawberryCandleCake2.getDesc() + ":" +
    // strawberryCandleCake2.getPrice());

    AbstractCake cake = new Cake();
    cake = new CandleDecorator(cake); // 加蜡烛
    cake = new StrawberryDecorator(cake); // 加草莓
    cake = new StrawberryDecorator(cake); // 再加一份草莓

    System.out.println(cake.getDesc() + ":" + cake.getPrice());
  }
}
