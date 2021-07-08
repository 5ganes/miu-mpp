package assignment7.problem4;

public abstract interface FlyBehavior {
	
	default void fly() {
		System.out.println("\tfly with wings");
	};
}
