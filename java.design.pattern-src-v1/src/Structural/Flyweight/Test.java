package Structural.Flyweight;

public class Test {
  public static void main1(String[] args) {
    {
      String a = "abc";
      String b = "abc";
      String c = new String("abc");

      System.out.println("a==b: " + (a == b)); // true
      System.out.println("b==c: " + (c == b)); // false
    }
    System.out.println("+++++++++++++++++++++++++++++++++++=");
    {
      // Integer 缓存-128~127
      Integer a = 123;
      Integer b = Integer.valueOf(123);
      Integer c = new Integer(123);
      System.out.println("a==b: " + (a == b)); // true
      System.out.println("b==c: " + (c == b)); // false

      Integer d = 1000;
      Integer e = Integer.valueOf(1000);
      Integer f = new Integer(1000);
      System.out.println("d==e: " + (d == e)); // false
      System.out.println("f==e: " + (f == e)); // false
    }
  }

  public static void main(String[] args) {}
}
