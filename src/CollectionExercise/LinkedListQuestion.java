package CollectionExercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListQuestion {
    public static void main(String[] args) {
      //  Write a Java program to append the specified element to the end of a linked list
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Ujjawal");
        linkedList.add("Shruti");
        linkedList.add("Anisha");
        linkedList.add("Rohan");
        linkedList.add("Anju");
        System.out.println(linkedList);
      //Write a Java program to iterate through all elements in a linked list
        for (String e:
             linkedList) {
            System.out.print("  "+e);

        }
        System.out.println();
        //Write a Java program to iterate through all elements in a linked list starting at the specified position
        for (int i = 2; i <linkedList.size() ; i++) {
            System.out.print("  "+linkedList.get(i));
        }
        System.out.println();

        //Write a Java program to iterate a linked list in reverse order
        for (int i = linkedList.size()-1; i >=0 ; i--) {
            System.out.print("  "+linkedList.get(i));
        }
        System.out.println();

        //Write a Java program to insert the specified element at the specified position in the linked list
        linkedList.add(3,"Shaurya");
        System.out.println(linkedList);
        //Write a Java program to insert elements into the linked list at the first and last positions.
        linkedList.add(0,"Niharika");
        linkedList.add(linkedList.size(),"Suyash");
        System.out.println(linkedList);

        //Write a Java program to insert the specified element at the front and end of a linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original linked list:" + l_list);
        // Add an element to front of LinkedList
        l_list.offerFirst("Pihu");
        //add an element to last of LinkedList
        l_list.offerLast("Sakshi");
        System.out.println("Final linked list:" + l_list);
        //Write a Java program to remove the first and last elements from a linked list
        System.out.println(   l_list.removeFirst()+"   "+l_list.removeLast());
        //Convert the linkedList to ArrayList
        List<String> newList = new ArrayList<>(l_list);
        System.out.println(newList);
    }
}
