package StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //1: Creating Blank Stream
        Stream<Object> emptyStream = Stream.empty();

        //2: Array to Stream
        String names[] ={"Ujjawal","Arpita","Shruti","Aseem","Vipul"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });
        //3: Using Builder pattern
        Stream<Object> streamBuilder = Stream.builder().build();
        // 4: Using Arrays method
        IntStream arrayStream =  Arrays.stream(new int[]{2, 3, 4, 5, 6, 67, 765, 44});
        arrayStream.forEach(value -> {
            System.out.println(value);
        });

        //5: List set directly getting converted into streams

        System.out.println("++++++++++++++++++++++++++++++");
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(6);
        list2.add(44);
        list2.add(23);
        list2.add(33);
        list2.add(45);
        list2.stream().forEach(integer ->{
            System.out.print(integer+"    ");
        } );
    }
}
