package StreamPractice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeOne {
    public static void main(String[] args) {

       //Find the name starting with A...
        List<String> names = List.of("Aman","Aseem","Achin","Ujjawal","Arpita","Shruti");
        names.stream().filter(e->e.startsWith("A")).forEach(System.out::println);
        //FInd Square of each element...
        List<Integer> numbers = List.of(1,2,3,4,5,55,32);
        numbers.stream().map(e->e*e).forEach(System.out::println);
        //Find the sum of the list...
        numbers.stream().reduce(0,Integer::sum);
        //Find the min and Max of the list...
        System.out.println(numbers.stream().reduce(Integer.MAX_VALUE,(x,y)->x>y?x:y));
        System.out.println(numbers.stream().reduce(Integer.MIN_VALUE,(x,y)->x>y?y:x));
        //Distinct and sorted list
        numbers.stream().distinct().forEach(System.out::println);
        numbers.stream().sorted().forEach(System.out::println);
        //Sort using comparator...
        System.out.println("++++++++++++++++");
        numbers.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        System.out.println("++++++++++++++++");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("++++++++++++++++");
        numbers.stream().sorted(Comparator.comparing(e->e.hashCode())).forEach(System.out::println);
        //Collects example
        System.out.println(numbers.stream().map(x->3*x).collect(Collectors.toList()));


    }
}
