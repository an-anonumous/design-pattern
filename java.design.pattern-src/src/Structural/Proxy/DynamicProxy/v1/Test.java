package Structural.Proxy.DynamicProxy.v1;

public class Test {
  public static void main(String[] args) {
    DynamicProxyFactory factory = new DynamicProxyFactory(new UserDaoImpl());
    IUserDao proxy = (IUserDao) factory.getProxy();
    proxy.save();
  }
}
