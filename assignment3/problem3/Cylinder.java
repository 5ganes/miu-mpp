package MPP.assignment3.problem3;

public class Cylinder {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getRadius() {
        return this.radius;
    }

    public double computeVolume() {
        Circle c = new Circle(this.radius);
        return c.getArea() * this.height;
    }

}
