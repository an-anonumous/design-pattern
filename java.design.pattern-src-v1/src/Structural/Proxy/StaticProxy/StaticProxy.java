package Structural.Proxy.StaticProxy;

public class StaticProxy implements IFile {

  private IFile file;

  public void setFile(IFile file) {
    this.file = file;
  }

  @Override
  public String getInfo() {
    System.out.println("校验文件访问权限");
    return file.getInfo();
  }
}
