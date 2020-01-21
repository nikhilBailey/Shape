public class TriangularPrism extends Triangle implements Prism3D {
  double depth;

  @Override
  public double getDepth() {
    return depth;
  }

  @Override
  public void setDepth(double depth) {
    this.depth = depth;
  }

  @Override
  /** returns the surface area of the prism */
  public double getArea() {
    return (area * 2) + (sideB * depth) + (sideC * depth);
  }

  @Override
  public double getVolume() {
    return area * depth;
  }
}