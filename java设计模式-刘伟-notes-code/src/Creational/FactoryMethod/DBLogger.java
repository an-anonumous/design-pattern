package Creational.FactoryMethod;

public class DBLogger implements ILogger {
    @Override
    public void writeLog() {

        System.out.println("记录日志到数据库");
    }
}
