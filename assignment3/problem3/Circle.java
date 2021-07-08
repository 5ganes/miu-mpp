package MPP.assignment3.problem3;

public class Circle {

    private double radius;

    Circle(double r){
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

}
