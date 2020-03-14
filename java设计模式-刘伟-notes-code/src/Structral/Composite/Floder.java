package Structral.Composite;

import java.util.ArrayList;
import java.util.List;

public class Floder extends AbstractFile {

    protected List<AbstractFile> files = new ArrayList<AbstractFile>();

    public Floder(String name) {
        super(name);

    }

    @Override
    public void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        files.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return files.get(i);
    }

    @Override
    public void killVirus() {
        for (AbstractFile f : files) {
            f.killVirus();
        }
    }
}
