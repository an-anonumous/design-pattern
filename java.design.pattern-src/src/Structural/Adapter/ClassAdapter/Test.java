package Structural.Adapter.ClassAdapter;

public class Test {
  public static void main(String[] args) {
    Target t = new Adapter();
    System.out.println(t.add(1, 2));
  }
}
