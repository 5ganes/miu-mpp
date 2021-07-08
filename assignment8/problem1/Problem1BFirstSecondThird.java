package assignment8.problem1;

import assignment7.problem4.Duck;

import java.util.function.Supplier;

public class Problem1BFirstSecondThird {
    public static void main(String[] args) {

        Supplier<Double> supplier = new Supplier<Double>() { // i, ii
            @Override
            public Double get() {
                return Math.random();
            }
        };

        // Supplier<Double> supplier = () -> Math.random(); // i, ii
        System.out.println(supplier.get());

        // iii
        InnerRandom random = new InnerRandom();
        System.out.println(random.get());

    }

    static class InnerRandom implements Supplier<Double>{ // iii
        @Override
        public Double get() {
            return Math.random();
        }
    }

}
