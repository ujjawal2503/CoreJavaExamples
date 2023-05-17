package StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        
        //Create a list and filter the even numbers without Stream

        List<Integer> list1 = List.of(2, 3, 22, 33, 12, 31, 321, 4, 5, 8,8);
        //list1.remove(2);
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(6);
        list2.add(44);
        list2.add(23);
        list2.add(33);
        list2.add(45);
        List<Integer> list3 = Arrays.asList(2, 3, 22, 33, 12, 31, 321, 4, 5, 8);

        //filtering even no from List1
        List<Integer> listEven = new ArrayList<>();

        for (Integer i:
             list1) {
            if(i%2==0)
                listEven.add(i);
        }
        System.out.println("++++++++++++++++++++++Even filter++++++++++++++++++");
        System.out.println(list1);
        System.out.println(listEven);

        //Create a list and filter the even numbers with Stream...

        Stream<Integer> stream = list1.stream();
        Set<Integer> newList = stream.filter(e -> e % 2 == 0).collect(Collectors.toSet());
        System.out.println(newList);
        // In one line...
        System.out.println(list1.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));
        System.out.println("Number greater than 10");
        System.out.println(list1.stream().filter(e -> e >10).collect(Collectors.toList()));
    }
}
