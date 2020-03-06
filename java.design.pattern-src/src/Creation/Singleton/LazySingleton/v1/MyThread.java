package Creation.Singleton.LazySingleton.v1;

public class MyThread implements Runnable {
  @Override
  public void run() {
    LazySingleton singleton = LazySingleton.getInstance();
    System.out.println(singleton);
  }
}
