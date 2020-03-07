package Structural.Proxy.DynamicProxy.v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyFactory implements InvocationHandler {
  private IUserDao userDao;

  public DynamicProxyFactory(IUserDao dao) {
    userDao = dao;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    if ("save".equalsIgnoreCase(method.getName())) {
      System.out.println("开启数据库事务");

      method.invoke(userDao, args);

      System.out.println("提交事务");
    }
    return userDao;
  }

  public Object getProxy() {
    return Proxy.newProxyInstance(
        this.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);
  }
}
