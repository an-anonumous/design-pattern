package Structral.Decorator;

public class ItalicDecorator extends Decorator {

    public ItalicDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        System.out.println("窗口字体显示斜体");
        super.display();
    }
}
