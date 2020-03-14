package Structral.Decorator;

public class Client {
    public static void main(String[] args) {
        Component window = new Window();
        window = new BlackBorderDecorator(window);
        window = new ItalicDecorator(window);
        window.display();

    }
}
