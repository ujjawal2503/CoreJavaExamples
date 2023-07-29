package CollectionExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListQuestion {
    public static void main(String[] args) {
       // Write a Java program to create an array list, add some colors (strings) and print out the collection.
        List<String> colourSet = new ArrayList<String>();
        colourSet.add("Orange");
        colourSet.add("Green");
        colourSet.add("Yellow");
        colourSet.add("Purple");
        for (String color:
             colourSet) {
            System.out.print(color+"  ");
        }

        //Write a Java program to insert an element into the array list at the first position.
        colourSet.set(0,"Blue");
        System.out.println(colourSet.get(0));
        //Write a Java program to update an array element by the given element
        colourSet.set(0,"Maroon");
        System.out.println(colourSet.get(0));
        //Write a Java program to remove the third element from an array list.
        colourSet.remove(2);
        System.out.println(colourSet);
        //Write a Java program to search for an element in an array list
        System.out.println("Green is present in list--" +colourSet.contains("Green"));
        //Write a Java program to sort a given array list
        Collections.sort(colourSet);
        System.out.println(colourSet);
        //Write a Java program to copy one array list into another
        List<String> listNew = new ArrayList<>();
        listNew.addAll(colourSet);
        System.out.println(listNew);
        //Write a Java program to shuffle elements in an array list.
        Collections.shuffle(listNew);
        System.out.println(listNew);
        //Write a Java program to reverse elements in an array list.
        Collections.reverse(listNew);
        System.out.println(listNew);
        //Write a Java program to extract a portion of an array list
        listNew.add("Black");
        listNew.add("Orange");
        System.out.println(listNew);
        List<String> sub_List = listNew.subList(2,5);
        System.out.println(sub_List);
        //Write a Java program to compare two array lists
        List<Boolean> compare_List = new ArrayList<>();
        for (String e:
             listNew) {
            compare_List.add(colourSet.contains(e)?true:false);
        }
        System.out.println(compare_List);
        //Write a Java program that swaps two elements in an array list.
        Collections.swap(listNew,3,4);
        System.out.println(listNew);
        //Write a Java program to join two array lists.
        listNew.addAll(colourSet);
        System.out.println(listNew);
        //Write a Java program to clone an array list to another array list
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        ArrayList<String> newClone = (ArrayList<String>)c1.clone();
        System.out.println("Cloned array list: " + newClone);
        //Write a Java program to empty an array list
        System.out.println(listNew.isEmpty());
        //Write a Java program for trimming the capacity of an array list.
        c1.trimToSize();
        System.out.println(c1);
        //Write a Java program to increase an array list size
        ArrayList<String> c11= new ArrayList<String>(3);
        c11.add("Red");
        c11.add("Green");
        c11.add("Black");
        System.out.println("Original array list: " + c11);
        //Increase capacity to 6
        c11.ensureCapacity(6);
        c11.add("White");
        c11.add("Pink");
        c11.add("Yellow");
        System.out.println("New array list: " + c11);
        //Write a Java program to print all the elements of an ArrayList using the elements' position.
        for (int i = 0; i < listNew.size(); i++) {
            System.out.println(i+" position element --"+listNew.get(i));
        }
    }
}
