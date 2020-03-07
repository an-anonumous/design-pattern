package Structural.Adapter.ObjectAdapter;

public class Adapter implements Target {

  Adapee adapee = new Adapee();

  @Override
  public int sub(int a, int b) {
    double arr[] = new double[1];
    adapee.sub(a, b, arr);
    return (int) arr[0];
  }
}
