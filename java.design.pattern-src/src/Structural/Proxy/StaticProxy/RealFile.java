package Structural.Proxy.StaticProxy;

public class RealFile implements IFile {

  private String name;
  private String info;

  public RealFile(String name, String info) {
    this.name = name;
    this.info = info;
  }

  @Override
  public String getInfo() {
    return "RealFile{" + "name='" + name + '\'' + ", info='" + info + '\'' + '}';
  }
}
