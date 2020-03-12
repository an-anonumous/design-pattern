package Creational.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        IFactory factory = null;
        ILogger logger = null;

        factory = new FileLoggerFatory();
        logger = factory.createLogger();
        logger.writeLog();

        factory = new DBLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
