package Behavioral.Iterator;

public interface Container<T> {

  public Iterator getIterator();

  public void add(T t);

  public void remove(T t);
}
