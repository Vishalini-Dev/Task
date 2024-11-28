//Question1

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCaseList {
    public static void main(String[] args) {
        Stream<String> names=Stream.of("aBc","d","ef");
        Stream<String> upperCaseStream=names.map(String ->String.toUpperCase());
        List<String> upperCaseList=upperCaseStream.collect(Collectors.toList());
        System.out.println("List of Strings converted to UpperCase:");
        System.out.println(upperCaseList);
    }
}
