package Structural.Composite;

public class Test {
  public static void main(String[] args) {
    Folder rootFolder = new Folder("root");
    Folder javaFloder = new Folder("java");
    rootFolder.add(javaFloder);

    javaFloder.add(new File("java从入门到放弃", "java从入门到放弃.pdf"));
    javaFloder.add(new File("java 虚拟机", "java 虚拟机.mp4"));
    javaFloder.add(new File("java并发编程", "java并发编程.docx"));

    Folder cppFloder = new Folder("c++");
    rootFolder.add(cppFloder);
    cppFloder.add(new File("c++ prime", "c++ prime.docx"));
    cppFloder.add(new File("c++ 网络编程", "c++ 网络编程.pptx"));
    cppFloder.add(new File("c++ 设计模式", "c++ 设计模式.md"));

    rootFolder.print();
  }
}
