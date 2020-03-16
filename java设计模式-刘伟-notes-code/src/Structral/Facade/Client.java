package Structral.Facade;

public class Client {
    public static void main(String[] args) {
        new EncryptionFacade().encryptionFile("E:\\Download\\小龙女1.jpg", "E:\\Download\\小龙女2.jpg");
    }
}
