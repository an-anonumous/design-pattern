package Creational.AbstractFactory;

public class SummerFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public Picture createPicture() {
        return new SummerPicture();
    }

    @Override
    public Textbox createTextbox() {
        return new SummerTextbox();
    }
}
