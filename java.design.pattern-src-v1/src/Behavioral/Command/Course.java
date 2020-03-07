package Behavioral.Command;

public class Course {
  private String name;
  private boolean isOpen = false;

  public Course(String name, boolean isOpen) {
    this.name = name;
    this.isOpen = isOpen;
  }

  public Course(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void open() {
    isOpen = true;
  }

  public void close() {
    isOpen = false;
  }
}
