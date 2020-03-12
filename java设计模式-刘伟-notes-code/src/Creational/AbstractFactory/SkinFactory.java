package Creational.AbstractFactory;

public interface SkinFactory {
    public Button createButton();

    public Picture createPicture();

    public Textbox createTextbox();
}
