package Behavioral.Memento;

import java.util.Stack;

public class CareTaker {
  private Stack<Memento> stack = new Stack<>();

  public void addMemento(Memento memento) {
    stack.push(memento);
  }

  public Memento pop() {
    return stack.pop();
  }

  @Override
  public String toString() {
    return "CareTaker{" + "stack=" + stack + '}';
  }
}
