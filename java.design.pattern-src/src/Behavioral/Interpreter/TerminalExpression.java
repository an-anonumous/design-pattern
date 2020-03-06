package Behavioral.Interpreter;

public class TerminalExpression implements AbstractExpression {

  private boolean data;

  public TerminalExpression(boolean data) {
    this.data = data;
  }

  @Override
  public boolean interpret() {
    return data;
  }
}
