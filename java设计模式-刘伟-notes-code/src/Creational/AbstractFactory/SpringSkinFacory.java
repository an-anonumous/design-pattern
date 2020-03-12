package Creational.AbstractFactory;

public class SpringSkinFacory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public Picture createPicture() {
        return new SpringPicture();
    }

    @Override
    public Textbox createTextbox() {
        return new SpringTextbox();
    }
}
