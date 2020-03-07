package Behavioral.Iterator;

import java.util.List;

public class MyIterator<T> implements Iterator<T> {

  private List<T> list;
  private int index = 0; // 下一个要访问的元素下标

  public MyIterator(List<T> list) {
    this.list = list;
  }

  public void setList(List<T> list) {
    this.list = list;
  }

  @Override
  public boolean hashNext() {
    return index < list.size();
  }

  @Override
  public T next() {
    return list.get(index++);
  }
}
