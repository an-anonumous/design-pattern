package Structral.Bridge;

public class WindowsImp implements ImageImp {
    @Override
    public void dispaly(Matrix m) {
        System.out.println("调用Windows api 来显示像素矩阵");
    }
}
