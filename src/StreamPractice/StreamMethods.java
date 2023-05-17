package StreamPractice;

import java.util.List;

public class StreamMethods {
    public static void main(String[] args) {
    //Implementing filter and Map Method...

        //1:- Filter based on string starting with A
        List<String> names = List.of("Aman","Aseem","Achin","Ujjawal","Arpita","Shruti");
        names.stream().filter(e->e.startsWith("A")).forEach(e->{
            System.out.println(e);
        });
        //Using Method reference :: here

        names.stream().filter(e->e.startsWith("A")).forEach(System.out::println);

        //2:- Mapping to the square of it's element\

        System.out.println("-----------------------");
        List<Integer> list = List.of(3,4,5,6,7,78,26);
        list.stream().map(e->e*e).forEach(integer -> {
            System.out.println(integer);
        });
        System.out.println("-----------------------");
        //3: - Sorted method
        list.stream().sorted().forEach(System.out::println);
        System.out.println("-----------------------");
        //4: Min and Max
       Integer min = list.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(min);
        //here we are using method reference of Integer Class
        Integer max =list.stream().max(Integer::compareTo).get();
        System.out.println(max);
    }
}
