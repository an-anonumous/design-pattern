package Structral.Facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public String read(String path) {
        System.out.println("读取文明");
        StringBuffer buffer = new StringBuffer();
        try {
            FileInputStream in = new FileInputStream(path);
            int data;
            while ((data = in.read()) != -1) {
                buffer.append((char) (data));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }
}
