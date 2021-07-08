package MPP.assignment5.problem3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private static double sumAreas = 0;

	public static void main(String[] args) {
		
		List<Figure> list = new ArrayList<Figure>();
		
		list.add(new Circle(20.5));
		list.add(new Triangle(11.5, 5));
		list.add(new Rectangle(2, 5));
		
		for (Figure shape : list){
			sumAreas += shape.computeArea();
		}

		System.out.println("Sum of areas of all figures = " + sumAreas);
	}

}
