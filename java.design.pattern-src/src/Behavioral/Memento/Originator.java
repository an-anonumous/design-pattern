package Behavioral.Memento;

public class Originator {
  private String state;

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Memento saveToMemento() {
    return new Memento(state);
  }

  public void recoverMemento(Memento memento) {
    state = memento.getState();
  }

  @Override
  public String toString() {
    return "Originator{" + "state='" + state + '\'' + '}';
  }
}
