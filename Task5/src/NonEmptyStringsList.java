//Question2

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonEmptyStringsList {
    public static void main(String[] args) {
        System.out.println("List contains empty and non empty strings:");
        List<String> listStrings= Arrays.asList("abc","","bc","efg","abcd","","jkl");
        System.out.println(listStrings);
        Stream<String> stringStream=listStrings.stream();
        Stream<String> nonEmptyString=stringStream.filter(String ->!String.isEmpty());
        List<String> nonEmptyList=nonEmptyString.collect(Collectors.toList());
        System.out.println("List contains non empty strings:");
        System.out.println(nonEmptyList);
    }
}

