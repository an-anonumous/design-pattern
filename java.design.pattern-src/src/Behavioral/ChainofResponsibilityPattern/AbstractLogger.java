package Behavioral.ChainofResponsibilityPattern;

public abstract class AbstractLogger {

  //    日志级别
  public static final int INFO = 1;
  public static final int DEBUG = 2;
  public static final int ERROR = 3;

  private int logLevel;
  private AbstractLogger nextLogger = null;

  public AbstractLogger(int logLevel, AbstractLogger nextLogger) {
    this.logLevel = logLevel;
    this.nextLogger = nextLogger;
  }

  public int getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(int logLevel) {
    this.logLevel = logLevel;
  }

  public AbstractLogger getNextLogger() {
    return nextLogger;
  }

  public void setNextLogger(AbstractLogger nextLogger) {
    this.nextLogger = nextLogger;
  }

  public void logMsg(int level, String msg) {

    if (this.logLevel >= level) {
      write(msg);
    }

    if (nextLogger != null) {
      nextLogger.logMsg(level, msg);
    }
  }

  public abstract void write(String message);
}
