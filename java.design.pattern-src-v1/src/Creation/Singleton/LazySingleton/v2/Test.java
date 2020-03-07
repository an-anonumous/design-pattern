package Creation.Singleton.LazySingleton.v2;

public class Test {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      new Thread() {
        @Override
        public void run() {
          LazySingleton singleton = LazySingleton.getInstence();
          System.out.println(singleton);
        }
      }.start();
    }
  }
}
