package Behavioral.Interpreter;

public class OrExpression implements AbstractExpression {

  private AbstractExpression left = null;
  private AbstractExpression right = null;

  public OrExpression(AbstractExpression left, AbstractExpression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public boolean interpret() {
    return left.interpret() || right.interpret();
  }
}
