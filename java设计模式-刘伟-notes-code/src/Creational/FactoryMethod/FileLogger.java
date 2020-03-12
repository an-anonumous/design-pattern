package Creational.FactoryMethod;

public class FileLogger implements ILogger {
    @Override
    public void writeLog() {
        System.out.println("记录日志到文件");
    }
}
