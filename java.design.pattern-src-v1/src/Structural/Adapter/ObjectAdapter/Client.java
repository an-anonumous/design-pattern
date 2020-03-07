package Structural.Adapter.ObjectAdapter;

public class Client {

  public static void main(String[] args) {
    Target t = new Adapter();

    System.out.println(t.sub(100, 1));
  }
}
