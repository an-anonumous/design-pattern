package Structral.Bridge;

public class SolarisImpl implements ImageImp {
    @Override
    public void dispaly(Matrix m) {
        System.out.println("调用Solaris api 来显示像素矩阵");
    }
}
