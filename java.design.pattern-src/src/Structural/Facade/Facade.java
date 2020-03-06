package Structural.Facade;

public class Facade {
  private SubsystemA subsystemA;
  private SubsystemB subsystemB;
  private SubsystemC subsystemC;

  public Facade() {
    subsystemA = new SubsystemA();
    subsystemB = new SubsystemB();
    subsystemC = new SubsystemC();
  }

  public void service() {
    subsystemA.service();
    subsystemB.service();
    subsystemC.service();
  }
}
