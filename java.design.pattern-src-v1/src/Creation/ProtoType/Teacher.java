package Creation.ProtoType;

public class Teacher implements Cloneable {
  private String name;
  private String number;

  public Teacher(String name, String number) {
    this.name = name;
    this.number = number;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return (Teacher) super.clone();
  }

  @Override
  public String toString() {
    return "Teacher{"
        + "name='"
        + name
        + '\''
        + ", number='"
        + number
        + '\''
        + '}'
        + super.toString();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }
}
