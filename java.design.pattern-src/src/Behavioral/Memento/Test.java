package Behavioral.Memento;

public class Test {
  public static void main(String[] args) {
    CareTaker careTaker = new CareTaker();
    Originator originator = new Originator();

    originator.setState("#1");
    originator.setState("#2");
    careTaker.addMemento(originator.saveToMemento());

    System.out.println(careTaker);
    System.out.println(originator);

    originator.setState("#3");
    careTaker.addMemento(originator.saveToMemento());
    originator.setState("#4");
    careTaker.addMemento(originator.saveToMemento());

    System.out.println(careTaker);
    System.out.println(originator);

    originator.recoverMemento(careTaker.pop());
    originator.recoverMemento(careTaker.pop());
    originator.setState("#5");

    System.out.println(careTaker);
    System.out.println(originator);

    originator.setState("#6");
    careTaker.addMemento(originator.saveToMemento());
    originator.setState("#7");

    System.out.println(careTaker);
    System.out.println(originator);
  }
}
