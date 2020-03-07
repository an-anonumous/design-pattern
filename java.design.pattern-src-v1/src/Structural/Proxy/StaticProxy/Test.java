package Structural.Proxy.StaticProxy;

public class Test {

  public static void main(String[] args) {
    RealFile file = new RealFile("绝密文件", "商业机密");
    StaticProxy proxy = new StaticProxy();
    proxy.setFile(file);
    System.out.println(proxy.getInfo());
  }
}
