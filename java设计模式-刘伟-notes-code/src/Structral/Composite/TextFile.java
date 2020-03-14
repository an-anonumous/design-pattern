package Structral.Composite;

public class TextFile extends AbstractFile {
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void add(AbstractFile file) {

    }

    @Override
    public void remove(AbstractFile file) {

    }

    @Override
    public AbstractFile getChild(int i) {
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("正在对文本文件" + name + "杀毒");
    }
}
