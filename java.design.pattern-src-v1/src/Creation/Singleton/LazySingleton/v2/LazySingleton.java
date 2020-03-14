package Creation.Singleton.LazySingleton.v2;

public class LazySingleton {
  private static volatile LazySingleton instence = null; // 禁止指令重排序

  private LazySingleton() {}

  public static LazySingleton getInstence() {

    if (instence == null) {

      try {
        Thread.sleep((long) (Math.random() % 100 + 10));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      synchronized (LazySingleton.class) {
        try {
          Thread.sleep((long) (Math.random() % 100 + 10));
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

        if (instence == null) { // 第二次检查
          instence = new LazySingleton();
        }
      }
    }

    return instence;
  }
}
