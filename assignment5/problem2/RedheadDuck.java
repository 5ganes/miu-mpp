package MPP.assignment5.problem2;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		super(new FlyWithWings(), new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("Displaying - RedheadDuck");
	}

}
