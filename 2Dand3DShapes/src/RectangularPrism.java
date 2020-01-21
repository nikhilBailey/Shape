public class RectangularPrism extends Rectangle implements Prism3D {
    public double depth;

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
        return 2 * ((length * width) + (length * depth) + (width * depth));
    }

    @Override
    public double getVolume() {
        return length * width * depth;
    }
}
