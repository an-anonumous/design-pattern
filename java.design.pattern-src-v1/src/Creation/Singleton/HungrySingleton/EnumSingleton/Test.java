package Creation.Singleton.HungrySingleton.EnumSingleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class Test {
  public static void main(String[] args)
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
          InstantiationException, IOException, ClassNotFoundException {
    EnumSingleton instance = EnumSingleton.getInstance();
    System.out.println(instance);

    //    反射攻击 Cannot reflectively create enum objects
    //    Constructor<EnumSingleton> constructor =
    //        EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
    //    constructor.setAccessible(true);
    //    EnumSingleton newInstance = constructor.newInstance("hello", 33);
    //    System.out.println(newInstance);
    //    System.out.println(instance == newInstance);

    //      反序列化
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("EnumSingleton"));
    out.writeObject(instance);
    out.flush();
    out.close();

    ObjectInputStream in = new ObjectInputStream(new FileInputStream("EnumSingleton"));
    EnumSingleton newInstance = (EnumSingleton) in.readObject();
    System.out.println(instance);
    System.out.println(newInstance);
    System.out.println(instance == newInstance);
  }
}
