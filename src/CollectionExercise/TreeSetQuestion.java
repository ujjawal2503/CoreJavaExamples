package CollectionExercise;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetQuestion {
    public static void main(String[] args) {


        TreeSet<Integer> newSet = new TreeSet<>();
        newSet.add(12);
        newSet.add(34);
        newSet.add(13);
        newSet.add(22);
        newSet.add(45);
        System.out.println(newSet);
        // Write a Java program to create a reverse order view of the elements contained in a given tree set.
        Iterator it = newSet.descendingIterator();
        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.print(it.next()+"  ");
        }
        System.out.println();
        // Write a Java program to get the first and last elements in a tree set.
        System.out.println("first element   "+     newSet.first()+"     last element"+
        newSet.last());
        //Retrieve and remove the first and last elements in a treeset.
        System.out.println("First element removed  "+newSet.pollFirst()+"last element removed  "+newSet.pollLast());


    }
}
