package Creation.Singleton.HungrySingleton.EnumSingleton;

public enum EnumSingleton {
  instance;

  public static EnumSingleton getInstance() {
    return instance;
  }
}
