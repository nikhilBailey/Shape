public class Triangle implements Shape2D {
    double base;
    double sideB;
    double sideC;

    /** height and area are automatically calculated and cannot be set. This structure is beneficial for calculating surface area of 3D shapes */
    double height;
    /** height and area are automatically calculated and cannot be set. This structure is beneficial for calculating surface area of 3D shapes */
    double area;

    @Override
    public double getArea() {
        return area;
    }

    public void calculateArea() {
        double s = (base + sideB + sideC) / 2;
        area = Math.sqrt(s * (s - base) * (s - sideB) * (s - sideC));
        calculateHeight();
    }

    public void calculateHeight() {
        height =  area * 2 / base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
        calculateArea();
    }

    public double getHeight() {
        return height;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
        calculateArea();
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
        calculateArea();
    }
}
