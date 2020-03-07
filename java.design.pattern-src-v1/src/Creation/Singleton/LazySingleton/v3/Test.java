package Creation.Singleton.LazySingleton.v3;

public class Test {

  public static void main(String[] args) {
    for (int i = 0; i < 1000; i++) {
      new Thread(
              new Runnable() {
                @Override
                public void run() {
                  LazySingleton instance = LazySingleton.getInstance();
                  System.out.println(instance);
                }
              })
          .start();
    }
  }
}
