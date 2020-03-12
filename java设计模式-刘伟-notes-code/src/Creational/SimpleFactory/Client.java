package Creational.SimpleFactory;

public class Client {
    public static void main(String[] args) {

//        为了在不修改客户端代码的前提下，更换要创建的具体产品，可以将要创建的对象类名写入xml文件，由客户端读取，
//        更换产品只需要修改配置文件

        Chart chart = SimpleFactory.getChart("linechart");
        if (chart != null) {
            chart.display();
        }


        chart = SimpleFactory.getChart("pieChart");
        if (chart != null) {
            chart.display();
        }

    }
}
