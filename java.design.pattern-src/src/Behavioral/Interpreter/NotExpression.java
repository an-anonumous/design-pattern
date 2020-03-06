package Behavioral.Interpreter;

public class NotExpression implements AbstractExpression {

  private AbstractExpression exp;

  public NotExpression(AbstractExpression data) {
    this.exp = data;
  }

  @Override
  public boolean interpret() {
    return !exp.interpret();
  }
}
