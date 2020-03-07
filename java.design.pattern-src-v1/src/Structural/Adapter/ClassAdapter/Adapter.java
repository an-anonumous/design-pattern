package Structural.Adapter.ClassAdapter;

public class Adapter extends Adapee implements Target {
  @Override
  public double add(double a, double b) {
    double arr[] = new double[1];
    super.add(a, b, arr);
    return arr[0];
  }
}
