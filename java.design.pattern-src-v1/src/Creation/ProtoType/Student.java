package Creation.ProtoType;

import java.util.Date;

public class Student implements Cloneable {
  private String name;
  private int age;
  private Gender gender;
  private String number;
  private Teacher teacher;
  private Date birthday;

  public Student() {
    System.out.println("constructing Student");
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Student student = (Student) super.clone(); // 默认的clone相当于memcpy()

    // 深拷贝
    student.teacher = (Teacher) this.teacher.clone();
    student.birthday = (Date) this.birthday.clone();

    // 虽然String 类没有实现Clonable，但是每次修改字符串内容，String的引用都会指向新的堆对象

    return student;
  }

  @Override
  public String toString() {
    return "Student{"
        + "name='"
        + name
        + '\''
        + ", age="
        + age
        + ", gender="
        + gender
        + ", number='"
        + number
        + '\''
        + ", teacher="
        + teacher
        + ", birthday="
        + birthday
        + '}'
        + super.toString();
  }
}
