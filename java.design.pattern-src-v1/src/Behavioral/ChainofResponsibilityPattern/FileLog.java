package Behavioral.ChainofResponsibilityPattern;

public class FileLog extends AbstractLogger {
  public FileLog(int logLevel, AbstractLogger nextLogger) {
    super(logLevel, nextLogger);
  }

  @Override
  public void write(String message) {
    StringBuilder log = new StringBuilder();
    log.append("[File]:[").append(this.getLogLevel()).append("] ").append(message);
    System.out.println(log);
  }
}
