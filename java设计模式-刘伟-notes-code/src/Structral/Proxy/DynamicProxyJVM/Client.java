package Structral.Proxy.DynamicProxyJVM;

public class Client {
    public static void main(String[] args) {
        UserDaoProxyFactory factory = new UserDaoProxyFactory(new UserDaoImp());
        IUserDao daoProxy = factory.getProxy();
        daoProxy.save();
    }
}
