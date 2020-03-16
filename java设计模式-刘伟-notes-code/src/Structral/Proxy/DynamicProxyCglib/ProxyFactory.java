package Structral.Proxy.DynamicProxyCglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    private IUserDao userDao;

    public ProxyFactory(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开启事务");
        Object temp = method.invoke(userDao, args);
        System.out.println("提交事务");
        return temp;
    }

    public IUserDao getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(userDao.getClass());
        enhancer.setCallback(this);
        return (IUserDao) enhancer.create();
    }
}
