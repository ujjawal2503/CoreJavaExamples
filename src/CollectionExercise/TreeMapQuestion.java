package CollectionExercise;

import java.util.TreeMap;

public class TreeMapQuestion {
    public static void main(String[] args) {
               /* Write a Java program to sort keys in a Tree Map by using a comparator.
                Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
                Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
                Write a Java program to get a reverse order view of the keys contained in a given map.
                Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
                Write a Java program to get the greatest key less than or equal to the given key.
                Write a Java program to get the portion of a map whose keys are strictly less than a given key.
                Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
                Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
                Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.*/

        TreeMap<String,String> tree_map1 = new TreeMap<String,String>(new sort_key());
        // Put elements to the map
        tree_map1.put("C2", "Red");
        tree_map1.put("C4", "Green");
        tree_map1.put("C3", "Black");
        tree_map1.put("C1", "White");
        System.out.println(tree_map1);
        TreeMap<Integer,String> treeMap_2 = new TreeMap<>();
        treeMap_2.put(1,"Aaloo");
        treeMap_2.put(2,"pyaaz");
        treeMap_2.put(3,"began");
        treeMap_2.put(4,"daniya");
        System.out.println("First key of the map   "+ treeMap_2.firstKey()+"   Last key of the map  "+ treeMap_2.lastKey());
        System.out.println("Reverse Key set of the map---"+treeMap_2.descendingKeySet());
        System.out.println("key-value mapping associated with the greatest key less than or equal to the given key    "+treeMap_2.floorEntry(3));
        System.out.println("Key mapping to greatest key or equal=---"+treeMap_2.floorKey(4));
        System.out.println("Entryset portion--"+treeMap_2.headMap(3,true));
        System.out.println("Least key greater than the given key"+ treeMap_2.ceilingKey(1));
        System.out.println("Least key greater than the given key"+ treeMap_2.ceilingKey(1));



        /*Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
Write a Java program to get a NavigableSet view of keys in a map.
Write a Java program to remove and get a key-value mapping associated with the least key in a map.
Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).
Write a Java program to get the portion of a map whose keys range from a given key to another key.
Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
Write a Java program to get a portion of a map whose keys are greater than a given key.
Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.*/
    }
}
