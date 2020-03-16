package Structral.Facade;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Encryption {
    public String md5encry(String plaintxt) {
        byte[] bytes = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            bytes = plaintxt.getBytes();
            md.update(bytes);
            String.valueOf(bytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return bytes.toString();
    }
}
