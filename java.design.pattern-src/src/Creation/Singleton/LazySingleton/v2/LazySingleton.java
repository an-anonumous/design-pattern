package Creation.Singleton.LazySingleton.v2;

public class LazySingleton {
  private static volatile LazySingleton instence = null;

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

        if (instence == null) {
          instence = new LazySingleton();
        }
      }
    }

    return instence;
  }
}
