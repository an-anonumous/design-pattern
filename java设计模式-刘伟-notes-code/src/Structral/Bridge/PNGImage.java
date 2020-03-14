package Structral.Bridge;

public class PNGImage extends Image {
    @Override
    public void parseAndShowImage() {
        System.out.println("將PNG文件" + fileName + "装换为矩阵");
        imageImp.dispaly(new Matrix());
    }
}
