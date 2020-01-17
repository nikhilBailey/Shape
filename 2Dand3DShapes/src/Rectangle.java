public class Rectangle extends Square{
    double width;

    @Override
    public double getArea() {
        return length * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
