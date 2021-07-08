package assignment7.problem4;

public interface QuackBehavior {
	default void quack() {
		System.out.println("\tquacking");
	};
}
