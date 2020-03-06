package Creation.Singleton.HungrySingleton.v1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Test {

  /**
   * 单例基本功能测试
   *
   * @param args
   */
  public static void main1(String[] args) {
    HungrySingleton instance = HungrySingleton.getInstance();
    System.out.println(instance);

    instance = HungrySingleton.getInstance();
    System.out.println(instance);
  }

  /**
   * 反序列化对单例的破坏及其解决办法
   *
   * @param args
   * @throws Exception
   */
  public static void main2(String[] args) throws Exception {
    HungrySingleton instance = HungrySingleton.getInstance();
    System.out.println(instance);

    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("instance"));
    out.writeObject(instance);
    out.close();

    ObjectInputStream in = new ObjectInputStream(new FileInputStream("instance"));
    HungrySingleton newInstance = (HungrySingleton) in.readObject();
    System.out.println(newInstance);
  }

  /**
   * 单例与反射
   *
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    HungrySingleton instance = HungrySingleton.getInstance();
    System.out.println(instance);

    Constructor<HungrySingleton> constructor = HungrySingleton.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    HungrySingleton newInstance = constructor.newInstance();
    System.out.println(newInstance == instance);
  }
}
