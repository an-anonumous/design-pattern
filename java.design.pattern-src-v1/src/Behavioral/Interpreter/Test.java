package Behavioral.Interpreter;

public class Test {
  public static void main(String[] args) {
    AbstractExpression andExpression =
        new AndExpression(new TerminalExpression(true), new TerminalExpression(false));
    AbstractExpression orExpression =
        new OrExpression(new TerminalExpression(false), new TerminalExpression(true));
    boolean interpret = new OrExpression(andExpression, orExpression).interpret();
    System.out.println(interpret);
  }
}
