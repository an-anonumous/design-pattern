package Creation.Singleton.LazySingleton.v3;

/** 静态内部类 */
public class LazySingleton {

  private LazySingleton() {
    if (InnerClass.instence != null) throw new RuntimeException("单例对象已经存在禁止反射调用构造函数");
  }

  public static LazySingleton getInstance() {
    return InnerClass.instence;
  }

  private static class InnerClass {
    private static LazySingleton instence = new LazySingleton();
  }
}
