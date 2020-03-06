package Structural.Flyweight;

import java.util.HashMap;

/** 享元工厂 */
public class CloudeStorageService {
  private static final HashMap<String, Resource> pool = new HashMap<>();

  private CloudeStorageService() {}

  public static boolean uploadResource(String name, Resource resource) {
    Resource r = pool.get(name);
    if (r == null) {
      pool.put(name, resource);
    }
    return true;
  }

  private String downloadResource(String name) {
    Resource r = pool.get(name);
    if (r != null) {
      return r.getResourceUrl();
    } else return "";
  }
}
