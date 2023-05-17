package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;

import java.util.Comparator;
import java.util.stream.*;
public class StreamPracticeCode {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",", "#", "#");
        stringJoiner.add("Interview");
        stringJoiner.add("Questions");
        stringJoiner.add("Answers");
        System.out.println("String after adding # in suffix and prefix :");
        System.out.println(stringJoiner);

        // Java 8 Program to Print ten random numbers using forEach
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        System.out.println(" iterate a Stream using the forEach method");
        List<String> str = Arrays.asList("Hello","Interview","Questions","Answers");
        str.stream().forEach(System.out::println);

        System.out.println("program to find the Minimum number of a Stream");
        Integer min = Stream.of(1, 2, 3, 4, 5, 6,7)
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("The Minimum number is: " + min);

        System.out.println(  "program to find the Maximum number of a Stream");
        Integer max = Stream.of(1, 2, 3, 4, 5, 6,7)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("The Maximum number is: " + max);

        System.out.println("Count Strings whose length is greater than 3 in List");
        List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
        long count = stringList.stream().filter(st -> st.length() > 3).count();
        System.out.println("String count with greater than 3 digit : " + count);

        System.out.println("Multiple into 3");
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(integerList.stream().map(i -> i*3).collect(Collectors.toList()));
        System.out.println("Program to concatenate two Streams");
        List<Integer> integerList1 = Arrays.asList(1,2,3,4);
        List<Integer> integerList2 = Arrays.asList(5,6,7);
        Stream<Integer> concatStream = Stream.concat(integerList1.stream(), integerList2.stream());
        concatStream.forEach(System.out::print);

        List<Integer> integerLi = Arrays.asList(1,2,3,4,1,2,3);
        System.out.println("After removing duplicates : ");
        integerLi.stream().collect(Collectors.toSet()).forEach(System.out::print);
        System.out.println("Sorting the list");
        List<Integer> integerList11 = Arrays.asList(4,5,6,7,1,2,3);
        integerList11.stream().sorted().forEach(System.out::println);
        System.out.println("Adding the element");
        List<Integer> integerList3 = Arrays.asList(4,5,6,7,1,2,3);
        System.out.println(integerList3.stream().mapToInt(Integer::intValue).sum());
        System.out.println("perfrom cube on list elements and filter numbers greater than 50.");
        List<Integer> integerList4 = Arrays.asList(4,5,6,7,1,2,3);
        integerList4.stream().map(i -> i*i*i).filter(i -> i>50).forEach(System.out::println);
    }
}

