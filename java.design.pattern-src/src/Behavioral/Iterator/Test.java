package Behavioral.Iterator;

public class Test {
  public static void main(String[] args) {
    Container<Course> container = new MyContainer<>();
    container.add(new Course("java"));
    container.add(new Course("C++"));
    container.add(new Course("设计模式"));
    container.add(new Course("计算机网络"));

    Iterator iterator = container.getIterator();
    while (iterator.hashNext()) {
      Course course = (Course) iterator.next();
      System.out.println(course);
    }
  }
}
