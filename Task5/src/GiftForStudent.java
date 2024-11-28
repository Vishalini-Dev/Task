//Question3

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GiftForStudent {
    public static void main(String[] args) {
        System.out.println("Overall student list:");
        List<String> studentNames= Arrays.asList("Alice", "Bob", "Anna", "John", "Alex", "Maria", "Andrew", "George", "Aaron", "Sophia");
        System.out.println(studentNames);
        Stream<String> nameStream=studentNames.stream();
        Stream<String> namesStartingWithA=nameStream.filter(String ->String.startsWith("A"));
        List<String> giftToStudent=namesStartingWithA.collect(Collectors.toList());
        System.out.println("Student List for Specials Gifts:");
        System.out.println(giftToStudent);
    }
}
