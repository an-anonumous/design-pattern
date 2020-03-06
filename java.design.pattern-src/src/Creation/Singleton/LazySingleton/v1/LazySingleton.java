package Creation.Singleton.LazySingleton.v1;

public class LazySingleton {

  private static LazySingleton singleton = null;

  //  隐藏构造函数
  private LazySingleton() {}

  public static synchronized LazySingleton getInstance() {
    if (singleton == null) {

      // 在并发环境下，可能导致多个单例对象被创建
      try {
        Thread.sleep((long) (Math.random() % 1000 + 10));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      singleton = new LazySingleton();
    }

    try {
      Thread.sleep((long) (Math.random() % 1000 + 10));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    return singleton;
  }
}
