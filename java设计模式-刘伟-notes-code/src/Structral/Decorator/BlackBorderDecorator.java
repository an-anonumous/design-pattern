package Structral.Decorator;

public class BlackBorderDecorator extends Decorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        System.out.println("为窗口组件增加黑色边框");
        super.display();
    }
}
