package Structral.Bridge;

public class LinuxImp implements ImageImp {
    @Override
    public void dispaly(Matrix m) {
        System.out.println("调用 linux api 来显示像素矩阵");
    }
}
