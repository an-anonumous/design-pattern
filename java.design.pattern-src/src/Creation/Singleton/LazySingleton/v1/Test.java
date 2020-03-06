package Creation.Singleton.LazySingleton.v1;

public class Test {

  public static void main(String[] args) {

    Thread thread;
    for (int i = 0; i < 100; i++) {
      thread = new Thread(new MyThread());
      thread.start();
    }

    Thread thread1 = new Thread(new MyThread());
    thread1.start();

    LazySingleton singleton = LazySingleton.getInstance();
    System.out.println(singleton);

    Thread thread2 = new Thread(new MyThread());
    thread2.start();

    //      Creation.Singleton.v1.LazySingleton@4554617c
    //      Creation.Singleton.v1.LazySingleton@370d37f
  }
}
