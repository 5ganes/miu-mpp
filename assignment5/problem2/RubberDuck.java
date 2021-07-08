package MPP.assignment5.problem2;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super(new CannotFly(), new Squeak());
	}
	
	@Override
	public void display() {
		System.out.println("Displaying - RubberDuck");
	}

}
