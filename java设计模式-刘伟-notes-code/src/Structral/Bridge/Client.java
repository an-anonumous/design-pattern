package Structral.Bridge;

public class Client {
    public static void main(String[] args) {
        Image image = new JPGImage();
        image.setImageImp(new WindowsImp());
        image.setFileName("小龙女.jpg");
        image.parseAndShowImage();
    }
}
