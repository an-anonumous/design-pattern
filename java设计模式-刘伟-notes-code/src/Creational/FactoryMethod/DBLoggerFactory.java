package Creational.FactoryMethod;

public class DBLoggerFactory implements IFactory {


    @Override
    public ILogger createLogger() {
        System.out.println("连接数据库");
        return new DBLogger();
    }
}
