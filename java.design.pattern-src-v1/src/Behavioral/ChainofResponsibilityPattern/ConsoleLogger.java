package Behavioral.ChainofResponsibilityPattern;

public class ConsoleLogger extends AbstractLogger {
  public ConsoleLogger(int logLevel, AbstractLogger nextLogger) {
    super(logLevel, nextLogger);
  }

  @Override
  public void write(String message) {
    StringBuilder log = new StringBuilder();
    log.append("[Console]:[").append(this.getLogLevel()).append("] ").append(message);
    System.out.println(log);
  }
}
