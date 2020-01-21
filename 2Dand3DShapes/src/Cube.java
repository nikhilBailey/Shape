public class Cube extends Square implements Shape3D {

  @Override
  public double getVolume() {
    return super.getArea() * length;
  }

  /** returns the surface area of the cube */
  @Override
  public double getArea() {
    return super.getArea() * 6;
  }
}
