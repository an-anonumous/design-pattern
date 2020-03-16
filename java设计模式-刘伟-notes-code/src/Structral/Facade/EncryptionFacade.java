package Structral.Facade;

public class EncryptionFacade {
    private FileReader fileReader = new FileReader();
    private FileWriter fileWriter = new FileWriter();
    private MD5Encryption encryption = new MD5Encryption();

    public void encryptionFile(String src, String dest) {

        String plaintxt = fileReader.read(src);
        String encryptedStr = encryption.md5encry(plaintxt);
        fileWriter.wirte(encryptedStr, dest);


    }

}
