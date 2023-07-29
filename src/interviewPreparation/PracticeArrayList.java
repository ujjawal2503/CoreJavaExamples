package interviewPreparation;

import java.util.*;

public class PracticeArrayList {
    public static void main(String[] args) {


            /*1. Write a program to find the second smallest element in an ArrayList.
            2. Write a program to remove duplicates from an ArrayList.
            3. Write a program to sort elements in an ArrayList in ascending order.
            4. Write a program to reverse the order of elements in an ArrayList.
            5. Write a program to find the intersection of two ArrayLists.*/

    List<Integer> newList = Arrays.asList(1,3,55,42,3,223);
    newList.sort(Integer::compareTo);
    System.out.println("Question number 1 --- second smallest element in an ArrayList.  ---"+newList.get(1));
        List<Integer> listWithoutDuplicates = new ArrayList<>();
        for(Integer e: newList) {
            if (!listWithoutDuplicates.contains(e)) {
                listWithoutDuplicates.add(e);
            }
        }
        System.out.println("Question number 2 ---  removing duplicates"+ listWithoutDuplicates);

    newList.sort(Integer::compareTo);
    System.out.println("Question number 3---SOrted list "+newList);
        Collections.reverse(newList);
        System.out.println("Question number 4--- Reversed list "+newList);
    List<Integer> listTwo =Arrays.asList(22,334,3,2,223);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        Set<Integer> set1 = new HashSet<>(list1);
        List<Integer> intersection = new ArrayList<>();

        for (Integer element : list2) {
            if (set1.contains(element)) {
                intersection.add(element);
            }
        }
    System.out.println("Question number 5--- intersection list "+intersection);



    } }
