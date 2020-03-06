package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Course extends Observable {

  private String courseName;
  private List<Question> list;

  public Course(String courseName) {
    this.courseName = courseName;
    list = new ArrayList<Question>();
  }

  public void addQuestion(Question question) {

    System.out.println("有新的提问：" + question);

    list.add(question);
    setChanged();
    notifyObservers(question);
  }
}
