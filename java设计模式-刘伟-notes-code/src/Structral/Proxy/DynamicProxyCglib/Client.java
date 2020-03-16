package Structral.Proxy.DynamicProxyCglib;

public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new UserDaoImp());
        IUserDao proxy = factory.getProxy();
        proxy.save();
    }
}
