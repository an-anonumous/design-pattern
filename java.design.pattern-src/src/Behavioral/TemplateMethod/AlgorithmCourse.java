package Behavioral.TemplateMethod;

public class AlgorithmCourse extends AbstractCourse {
  @Override
  protected void additionalOperation() {
    System.out.println("nothing");
  }

  @Override
  protected boolean needAnswerquestion() {
    return true;
  }
}
