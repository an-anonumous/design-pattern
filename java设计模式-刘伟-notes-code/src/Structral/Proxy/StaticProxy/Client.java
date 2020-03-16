package Structral.Proxy.StaticProxy;

public class Client {
    public static void main(String[] args) {
        UserDaoProxy proxy = new UserDaoProxy(new UserDaoImp());
        proxy.save();
    }
}
