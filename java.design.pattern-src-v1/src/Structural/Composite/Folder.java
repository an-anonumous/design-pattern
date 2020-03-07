package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
  private String name; // 目录名
  private List<Component> items = new ArrayList<>();

  public Folder(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void add(Component component) {
    items.add(component);
  }

  @Override
  public void remove(Component component) {
    items.remove(component);
  }

  @Override
  public void print() {
    //    System.out.println(name);
    //    for (Component c : items) {
    //      c.print();
    //    }
    print(0);
  }

  @Override
  protected void print(int level) {
    for (int i = 0; i < level; i++) System.out.print("\t");
    System.out.println(name);

    for (Component c : items) {
      for (int i = 0; i < level + 1; i++) System.out.print("\t");
      c.print(level + 1);
    }
  }
}
