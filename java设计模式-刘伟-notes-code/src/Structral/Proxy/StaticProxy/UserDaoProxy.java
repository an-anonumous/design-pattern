package Structral.Proxy.StaticProxy;

public class UserDaoProxy implements IUserDao {
    private IUserDao userDao;

    public UserDaoProxy(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("开启事务");
        userDao.save();
        System.out.println("提交事务");
    }
}
