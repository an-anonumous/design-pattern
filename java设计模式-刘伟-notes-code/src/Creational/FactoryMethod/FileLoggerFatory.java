package Creational.FactoryMethod;

public class FileLoggerFatory implements IFactory {
    @Override
    public ILogger createLogger() {
        System.out.println("打开文件。。。。。");
        return new FileLogger();
    }
}
