package Creation.Singleton.HungrySingleton.v1;

import java.io.Serializable;

public class HungrySingleton implements Serializable, Cloneable {
  private static final HungrySingleton instance;

  static {
    instance = new HungrySingleton();
  }

  private HungrySingleton() {
    //    防止反射调用构造函数
    if (instance != null) throw new RuntimeException("单例对象已经存在禁止，反射调用构造函数");
  }

  public static HungrySingleton getInstance() {
    return instance;
  }

  /**
   * 在反序列化的时候回默认先调用无参的构造函数生成一个对象，如果实现了readResolve方法，则返回该方法的返回值，放弃新的实例。
   *
   * @return
   */
  private Object readResolve() {
    return HungrySingleton.instance;
  }

  /**
   * 防止clone破坏单例
   *
   * @return
   * @throws CloneNotSupportedException
   */
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return getInstance();
  }
}
