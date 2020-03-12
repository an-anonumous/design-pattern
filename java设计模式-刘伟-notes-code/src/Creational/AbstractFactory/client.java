package Creational.AbstractFactory;

public class client {
    public static void main(String[] args) {
        SkinFactory factory = new SummerFactory();
        Button button = factory.createButton();
        Picture picture = factory.createPicture();
        Textbox textbox = factory.createTextbox();

        button.display();
        picture.display();
        textbox.display();

        factory = new SpringSkinFacory();
        button = factory.createButton();
        picture = factory.createPicture();
        textbox = factory.createTextbox();

        button.display();
        picture.display();
        textbox.display();
    }
}
