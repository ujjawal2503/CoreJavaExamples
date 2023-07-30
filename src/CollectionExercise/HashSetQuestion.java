package CollectionExercise;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HashSetQuestion {
    public static void main(String[] args) {

       // 1. Write a Java program to append the specified element to the end of a hash set.
        Set<String> newSet =new HashSet<>();
        newSet.add("Earphone");
        newSet.add("Bluetooth");
        newSet.add("Mouse");
        System.out.println(newSet);

        //2. Write a Java program to iterate through all elements in a hash list.
        for (String e:
             newSet) {
            System.out.print(e+"  ");
        }
        System.out.println();
        //3. Write a Java program to get the number of elements in a hash set.
        System.out.println("Size of the Set--"+newSet.size());
       // 4. Write a Java program to empty an hash set.
        newSet.removeAll(newSet);
        System.out.println(newSet);
        //5. Write a Java program to test if a hash set is empty or not.
        System.out.println("newset is empty??--"+newSet.isEmpty());
        //6. Write a Java program to clone a hash set to another hash set.

        //7. Write a Java program to convert a hash set to an array.
        HashSet<Integer> newNumberSet = new HashSet<>();
        newNumberSet.add(1);
        newNumberSet.add(5);
        newNumberSet.add(12);
        newNumberSet.add(13);
        newNumberSet.add(14);
        newNumberSet.add(15);
        newNumberSet.add(16);
        Integer [] array = new Integer[newNumberSet.size()];
        newNumberSet.toArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print("  "+array[i]);
        }
        System.out.println();
        //8. Write a Java program to convert a hash set to a tree set.
        TreeSet<Integer> newTreeSet = new TreeSet<>(newNumberSet);
        System.out.println(newTreeSet);
        //9. Write a Java program to find numbers less than 7 in a tree set.
        Set<Integer> collectList = newNumberSet.stream().filter(e -> e < 7).collect(Collectors.toSet());
        System.out.println(collectList);

        //11. Write a Java program to compare two sets and retain elements that are the same.
        Set<Integer> newSet1 =new TreeSet<>();
        for (Integer e:
             newNumberSet) {
            if(collectList.contains(e)){
                newSet1.add(e);
            }
        }
        System.out.println(newSet1);
        //12. Write a Java program to remove all elements from a hash set.
        newSet1.removeAll(newSet1);
        System.out.println(newSet1);
    }
}
