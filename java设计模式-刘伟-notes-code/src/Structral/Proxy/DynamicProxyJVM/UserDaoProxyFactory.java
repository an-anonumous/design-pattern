package Structral.Proxy.DynamicProxyJVM;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserDaoProxyFactory implements InvocationHandler {
    private IUserDao userDao;

    public UserDaoProxyFactory(IUserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开启事务");
        Object o = method.invoke(userDao, args);
        System.out.println("提交事务");
        return o;
    }

    public IUserDao getProxy() {
        return (IUserDao) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(), this);
    }


}
