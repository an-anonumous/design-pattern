package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class MyContainer<T> implements Container<T> {
  private List<T> list = new ArrayList<T>();

  @Override
  public Iterator getIterator() {
    return new MyIterator(list);
  }

  @Override
  public void add(T o) {
    list.add(o);
  }

  @Override
  public void remove(T o) {
    list.remove(o);
  }
}
