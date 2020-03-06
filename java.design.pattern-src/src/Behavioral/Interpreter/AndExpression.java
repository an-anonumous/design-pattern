package Behavioral.Interpreter;

public class AndExpression implements AbstractExpression {

  private AbstractExpression left = null;
  private AbstractExpression right = null;

  public AndExpression(AbstractExpression left, AbstractExpression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public boolean interpret() {
    return left.interpret() && right.interpret();
  }
}
