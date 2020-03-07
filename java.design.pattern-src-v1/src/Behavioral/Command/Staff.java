package Behavioral.Command;

import java.util.ArrayList;
import java.util.List;

public class Staff {
  List<Icommand> commands = new ArrayList<>();

  public void addCommends(Icommand command) {
    commands.add(command);
  }

  public void executeCommands() {
    for (Icommand c : commands) {
      c.execute();
    }
  }
}
