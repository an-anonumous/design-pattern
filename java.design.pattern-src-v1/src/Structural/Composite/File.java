package Structural.Composite;

public class File extends Component {

  private String name;
  private String content;

  public File(String name, String content) {
    this.name = name;
    this.content = content;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void print() {
    System.out.println(content);
  }

  protected void print(int level) {
    for (int i = 0; i < level; i++) System.out.print("\t");
    System.out.println(content);
  }

  @Override
  public String getContent() {
    return content;
  }
}
