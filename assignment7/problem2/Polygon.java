package assignment7.problem2;

public interface Polygon extends ClosedCurve {

    public double[] getSides();

    public default double computePerimeter(){
        double totalPerimeter = 0;
        double[] sideList = getSides();
        for (double side : sideList){
            totalPerimeter += side;
        }
        return totalPerimeter;
    }

}
