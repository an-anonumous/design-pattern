package Creational.AbstractFactory;

public class SpringTextbox implements Textbox {
    @Override
    public void display() {
        System.out.println("显示浅绿色文本框");
    }
}
