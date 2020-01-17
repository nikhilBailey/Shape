public class Square implements Shape2D{
    double length;

    @Override
    public double getArea() {
        return length * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
