public class Cone extends Circle implements Pyramid3D {

  double slantLength;
  double height;

  @Override
  public double getSlantLength() {
    return slantLength;
  }

  @Override
  public void setSlantLength(double slantLength) {
    this.slantLength = slantLength;
  }

  @Override
  public void calculateHeight() {
    height = Math.sqrt(Math.pow(slantLength, 2) -  Math.pow(radius, 2));
  }

  @Override
  public double getArea() {
    return super.getArea() + (Math.PI * radius * slantLength);
  }

  @Override
  public double getVolume() {
    return super.getArea() * height / 3;
  }
}
