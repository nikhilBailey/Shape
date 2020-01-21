public class Cylinder extends Circle implements Prism3D {
  double depth;

  @Override
  public double getDepth() {
    return 0;
  }

  @Override
  public void setDepth(double depth) {
    this.depth = depth;
  }

  @Override
  public double getVolume() {
    return super.getArea() * depth;
  }

  @Override
  /** returns the surface area of the prism */
  public double getArea() {
    return (Math.PI * 2 * radius * depth) + (super.getArea() * 2);
  }
}
