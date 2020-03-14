package Structral.Bridge;

public class BMPImage extends Image {
    @Override
    public void parseAndShowImage() {
        System.out.println("將BMP文件" + fileName + "装换为矩阵");
        imageImp.dispaly(new Matrix());
    }
}
