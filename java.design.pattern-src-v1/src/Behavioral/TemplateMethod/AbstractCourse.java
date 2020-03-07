package Behavioral.TemplateMethod;

public abstract class AbstractCourse {
  public final void makeCourse() {
    makePPT();
    makeVideo();
    if (needAnswerquestion()) {
      answerQuestions();
    }
  }

  protected final void makePPT() {
    System.out.println("制作PPT");
  }

  protected final void makeVideo() {
    System.out.println("录制课程视频");
  }

  protected void additionalOperation() {}

  protected final void answerQuestions() {
    System.out.println("线上答疑");
  }

  // 钩子方法
  protected boolean needAnswerquestion() {
    return false;
  }
}
