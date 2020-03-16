package Structral.Facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void wirte(String content, String path) {
        System.out.println("将加密后的文件写入磁盘");
        try {
            FileOutputStream out = new FileOutputStream(path);
            out.write(content.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
