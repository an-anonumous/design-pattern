package Behavioral.ChainofResponsibilityPattern;

public class Test {
  public static void main(String[] args) {
    ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG, null);
    AbstractLogger chain = new FileLog(AbstractLogger.ERROR, consoleLogger);
    chain.logMsg(AbstractLogger.DEBUG, "责任链模式");
  }
}
