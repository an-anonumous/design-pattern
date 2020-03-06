package Creation.ProtoType;

import java.util.Date;

public class Test {
  public static void main(String[] args) throws CloneNotSupportedException {

    // 不论C++ 还是java "abc"都存到了常量表中
    //    char * p="abc";
    String str = "abc";

    Student student = new Student();
    student.setAge(22);
    student.setGender(Gender.male);
    student.setName("王麻子");
    student.setNumber("1336984");
    student.setTeacher(new Teacher("爱因斯坦", "91234712934"));
    student.setBirthday(new Date(158756646L));

    Student student2 = (Student) student.clone();

    student2.setName("哈哈");
    student2.setAge(110);
    student2.setNumber("9876543211");
    student2.getTeacher().setName("蔡元培");
    student2.getTeacher().setNumber("AAAAAAA");
    student2.getBirthday().setTime(0L);
    System.out.println(student);

    System.out.println(student2);
  }
}
