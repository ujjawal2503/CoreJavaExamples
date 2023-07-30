package CollectionExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueQuestion {
    public static void main(String[] args) {
       /* 1.Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue.
        2. Write a Java program to iterate through all elements in the priority queue.
        3. Write a Java program to add all the elements of a priority queue to another priority queue.
        4. Write a Java program to insert a given element into a priority queue.
        5. Write a Java program to remove all elements from a priority queue.
        6. Write a Java program to count the number of elements in a priority queue.
        7. Write a Java program to compare two priority queues.
        8. Write a Java program to retrieve the first element of the priority queue.
        9. Write a Java program to retrieve and remove the first element.
        10. Write a Java program to convert a priority queue to an array containing all its elements.
        11. Write a Java program to convert a Priority Queue element to string representations.
        12. Write a Java program to change priorityQueue to maximum priority queue.*/

        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println(queue);

        for (String s:queue
             ) {
            System.out.print("  "+s);
        }
        System.out.println();
        PriorityQueue<String> newQueue = new PriorityQueue<>();
        newQueue.addAll(queue);
        System.out.println(newQueue);

        newQueue.add("Yellow");
        System.out.println(newQueue);
        newQueue.removeAll(newQueue);
        System.out.println(newQueue);
        System.out.println("No. of elements--  "+queue.size());
        System.out.println("Removing first element   "+queue.peek()+"  retrieve the first element "+queue.poll());

        List<String> newArray = new ArrayList<>(queue);
        System.out.println("Array containing all the Queue elements  "+newArray);

        String queueToString = queue.toString();
        System.out.println("queue to String ===  "+queueToString);
        String val = null;
        while ((val= queue.poll())!=null){
            System.out.print("  "+ val);
        }

    }
}
