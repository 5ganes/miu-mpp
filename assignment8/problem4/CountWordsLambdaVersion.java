package assignment8.problem4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountWordsLambdaVersion {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("foot", "bolt", "best", "tab", "function");
        System.out.println(countWords(list, 't', 'e', 4));
    }

    public static int countWords(List<String> words, char c, char d, int len){
        return (int)words.stream()
                .filter(word -> word.contains(Character.toString(c)))
                .filter(word -> !word.contains(Character.toString(d)))
                .filter(word -> word.length() == len)
                .count();


        // another way using indexOf(method) where character should not be converted to String
        //    return (int)words.stream()
        //            .filter(word -> word.indexOf(c) > 0)
        //            .filter(word -> word.indexOf(d) < 0)
        //            .filter(word -> word.length() == len)
        //            .count();

    }

}
