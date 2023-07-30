package CollectionExercise;

import java.util.*;

public class HashMapQuestion {
    public static void main(String[] args) {

      /*  1. Write a Java program to associate the specified value with the specified key in a HashMap.
        2. Write a Java program to count the number of key-value (size) mappings in a map.
        3. Write a Java program to copy all mappings from the specified map to another map.
        4. Write a Java program to remove all mappings from a map.
        5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        6. Write a Java program to get a shallow copy of a HashMap instance.
        7. Write a Java program to test if a map contains a mapping for the specified key.
        8. Write a Java program to test if a map contains a mapping for the specified value.
        9. Write a Java program to create a set view of the mappings contained in a map.
        10. Write a Java program to get the value of a specified key in a map.
        11. Write a Java program to get a set view of the keys contained in this map.
        12. Write a Java program to get a collection view of the values contained in this map.*/
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Ujjawal");
        hashMap.put(2,"Ankit");
        hashMap.put(3,"Vinod");
        hashMap.put(14,"Arnav");
        hashMap.put(33,"Sohan");
        hashMap.put(23,"Suruki");
        hashMap.put(132,"Guddu");
        hashMap.put(198,"Ramesh");
        System.out.println(hashMap);
        System.out.println("The size of the hashmap   "+hashMap.size());
        HashMap<Integer,String> hashMapCopy = new HashMap<>(hashMap);
        System.out.println("the copy hashmap---"+hashMapCopy);
        hashMapCopy.clear();
        System.out.println("removing all the entries --"+hashMapCopy);
        System.out.println("hashmapcopy is empty??? ---"+hashMapCopy.isEmpty());
        HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>();
        new_hash_map = (HashMap)hashMap.clone();
        System.out.println("Cloned map: " + new_hash_map);
        System.out.println("1 key is contained in map?? --  "+hashMap.containsKey(1)+"  Ujjawal is contained in the hashmap  "+hashMap.containsValue("Ujjawal"));

       Set<Integer> set =  new HashSet<>();
             set = hashMap.keySet();
        System.out.println("The Key set of the map--- "+ set);
        Set set1 = hashMap.entrySet();
        System.out.println("The Entry set of the map----"+ set1);
        String s = hashMap.get(1);
        System.out.println("Against 1 key the value is ---"+s);
        Collection<String>  values = hashMap.values();




    }
}
