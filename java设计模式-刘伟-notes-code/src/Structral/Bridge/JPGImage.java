package Structral.Bridge;

public class JPGImage extends Image {
    @Override
    public void parseAndShowImage() {
        System.out.println("將JPG文件" + fileName + "装换为矩阵");
        imageImp.dispaly(new Matrix());
    }
}
