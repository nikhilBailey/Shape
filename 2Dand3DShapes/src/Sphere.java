public class Sphere extends Circle implements Shape3D {

  /** returns the surface area of the sphere */
  @Override
  public double getArea() {
    return super.getArea() * 4;
  }

  @Override
  public double getVolume() {
    return super.getArea() * radius * 4 / 3;
  }
}
