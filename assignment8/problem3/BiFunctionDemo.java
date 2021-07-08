package assignment8.problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static void main(String[] args) {

        BiFunction<Double, Double, List> result = (num1, num2) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(num1, num2));
            list.add(num1 * num2);
            return list;
        };

        System.out.println(result.apply(2.0, 3.0));

    }

}
