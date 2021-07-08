package assignment8.problem5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachImplementationAB {

    // a) lambda version
    static Consumer<String> myConsumer = string -> System.out.println(string.toUpperCase());

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Great place", "come back soon",
                "Go Away, its raining", "On Vacation", "Maharishi University");

        // print each element of the list in upper case format
        list.forEach(myConsumer);


        // b) with use of method reference
        System.out.println("\nWith use of method reference\n");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

    }

}
