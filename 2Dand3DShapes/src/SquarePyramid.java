public class SquarePyramid extends Square implements Pyramid3D {

  double slantLength;
  double height;

  @Override
  public double getSlantLength() {
    return slantLength;
  }

  @Override
  public void setSlantLength(double slantLength) {
    this.slantLength = slantLength;
    calculateHeight();
  }

  @Override
  public void calculateHeight() {
    height = Math.sqrt(Math.pow(slantLength, 2) -  Math.pow(length / 2, 2));
  }

  @Override
  public double getArea() {
    return super.getArea() + 4 * (slantLength * length / 2);
  }

  @Override
  public double getVolume() {
    return super.getArea() * height / 3;
  }
}
