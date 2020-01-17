public class Circle implements Shape2D {
    double radius;

    @Override
    public double getArea() {
        return Math.PI * 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
