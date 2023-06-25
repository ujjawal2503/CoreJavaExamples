package interviewPreparation;

import java.util.*;

public class PracticeCollections {
    public static void main(String[] args) {
        /* 1. Write a program to find the union of two Sets.
            2. Write a program to find the intersection of two Sets.
            3. Write a program to find the difference between two Sets.
            4. Write a program to check if a Set is a subset of another Set.
            5. Write a program to remove duplicates from a Set.
            6. Write a program to check if an element exists in a Set.
            7. Write a program to check if two Sets are equal.
            8. Write a program to sort elements in a TreeSet in ascending order.
            9. Write a program to find the maximum element in a TreeSet.
            10.Write a program to check if a HashSet is empty or not.*/

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Question number 1 ---> Union of two set "+ unionSet);

        Set<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        System.out.println("Question number 2 ---> intersection of two set "+ intersectSet);

        Set<Integer> diffSet = new HashSet<>(set1);
        diffSet.removeAll(set2);
        System.out.println("Question number 3 ---> difference of two set "+ intersectSet);

        Set<Integer> set3 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set4 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        boolean isSubset = set4.containsAll(set3);
        System.out.println("Question number 4 --->set3 is subset of set4   "+isSubset);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(4);
        set.add(5);

        Set<Integer> uniqueSet = new HashSet<>(set);
        //Set doesn't contain the duplicate element...
        System.out.println("Original Set: " + set);
        System.out.println("Question number 5 : Set after removing duplicates: " + uniqueSet);

        Set<String> setCheck = new HashSet<>();
        setCheck.add("apple");
        setCheck.add("banana");
        setCheck.add("orange");

        String element = "banana";
        boolean contains = set.contains(element);
        System.out.println("Question number 6: --- Does the set contain the element? " + contains);

        boolean equals = set1.equals(set2);
        System.out.println("Question number 7: --- SET1 is equals to set2 " + equals);

        //Question number 8 treeSet is already in sorted order
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(2);

        Integer integer = treeSet.stream().max(Integer::compareTo).get();
        int secondWay = ((TreeSet<Integer>) treeSet).last();
        System.out.println("Question number 9: --- Maximum from the treeSet --" + integer+"Second way"+secondWay);
        /*To find the maximum element, we use the last() method on the treeSet, casting it to a TreeSet<Integer> to access the specific method.
        The last() method returns the last (highest) element in the set, which corresponds to the maximum element.*/

        Set<Integer> hashSet = new HashSet<>();
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(1);
        hashSet.add(3);
        boolean isEmpty2 = hashSet.isEmpty();
        System.out.println("Question number 10: --- Checking hashset is empty or not    "+isEmpty+"  after adding element   "+isEmpty2);

        /*11.Write a program to convert a HashSet to an array.
        12.Write a program to remove all elements from a HashSet.
        13.Write a program to count the occurrences of each element in a HashSet.
        14.Write a program to find the smallest element in a TreeSet.
        15.Write a program to copy elements from one Set to another.
        */
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("apple");
        hashSet1.add("banana");
        hashSet1.add("orange");

        System.out.println("HashSet: " + hashSet1);

        // Convert HashSet to array
        String[] array = hashSet1.toArray(new String[hashSet1.size()]);

        System.out.println("Question number 11:----- Array: ");
        for (String element1 : array) {
            System.out.println(element1);
        }

        hashSet1.clear();

        System.out.println("Question number 12:  HashSet after removing all elements: " + hashSet1);

        HashSet<String> hashSet11= new HashSet<>();
        hashSet11.add("apple");
        hashSet11.add("banana");
        hashSet11.add("orange");
        hashSet11.add("banana");
        hashSet11.add("apple");
        hashSet11.add("orange");
        hashSet11.add("orange");

        System.out.println("HashSet: " + hashSet11);

        // Count occurrences of each element
        Map<String, Integer> elementCountMap = new HashMap<>();
        for (String element11 : hashSet11) {
            elementCountMap.put(element11, elementCountMap.getOrDefault(element11, 0) + 1);
        }

        System.out.println("Question number 13  Element Count: "+elementCountMap);
        for (Map.Entry<String, Integer> entry : elementCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Integer smallest = ((TreeSet<Integer>) treeSet).first();
        System.out.println("Question number 14--- Smallest from treeSet- "+smallest);

        Set<Integer> set5 = new HashSet<>();
        set5.add(3);
        set5.add(55);

        Set<Integer> setNew = new HashSet<>(set5);
        System.out.println("Question number 15---Copied the set ---"+ setNew);
//===============================================Question related to Maps =================================================
        /*16.Write a program to find the intersection of two Maps.
        17.Write a program to find the union of two Maps.
        18.Write a program to merge two Maps.
        19.Write a program to check if a key exists in a Map.
        20.Write a program to check if a value exists in a Map.*/

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "apple");
        map1.put(2, "banana");
        map1.put(3, "orange");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(2, "banana");
        map2.put(3, "kiwi");
        map2.put(4, "grape");

        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);

        // Find the intersection of two maps
        Map<Integer, String> intersection = new HashMap<>(map1);
        intersection.keySet().retainAll(map2.keySet());

        System.out.println("Question number 16---Intersection of Map 1 and Map 2: " + intersection);

        Map<Integer, String> union = new HashMap<>(map1);
        union.putAll(map2);

        System.out.println("Question number 17---Union of Map 1 and Map 2: " + union);

        Map<Integer, String> mergedMap = new HashMap<>(map1);
        mergedMap.putAll(map2);

        System.out.println("Question number 18---Merged Map: " + mergedMap);

        int keyToCheck = 2;
        // Check if a key exists in the map
        boolean keyExists = map1.containsKey(keyToCheck);
        System.out.println("Question number 19---Key " + keyToCheck + " exists in the map: " + keyExists);

        String valueToCheck = "banana";
        // Check if a value exists in the map
        boolean valueExists = map1.containsValue(valueToCheck);
        System.out.println("Question number 20---Value " + valueToCheck + " exists in the map: " + valueExists);

        /* 21.Write a program to remove an entry from a Map based on a key.
        22.Write a program to remove an entry from a Map based on a value.
        23.Write a program to get the keys of a Map.
        24.Write a program to get the values of a Map.
        25.Write a program to find the size of a Map.*/
        map2.remove(2);
        System.out.println("Question number 21: --- after removing based on key" +map2);
        map2.remove(3,"kiwi");
        System.out.println("Question number 22: --- after removing based on Value" +map2);
        Set<Integer> keySet = map1.keySet();
        System.out.println("Question number 23: --- KeySet of map-- " +keySet);
        Collection<String> values = map1.values();
        System.out.println("Question number 24: --- valueSet of map--" +values);
        int sizeMap = map1.size();
        System.out.println("Question number 25: --- Size of the map  " +sizeMap);

        /*26.Write a program to check if a Map is empty or not.
        27.Write a program to remove all entries from a Map.
        28.Write a program to iterate over the entries of a Map.
        29.Write a program to sort the keys of a Map in ascending order.
        30.Write a program to sort the values of a Map in ascending order*/

        map2.clear();
        System.out.println("Question number 26: --- map is empty or not----"+map2.isEmpty());
        System.out.println("Question number 27: --- removed all the entries"+map2);
        System.out.println("Question number 28: Entries iteration");
        for(Map.Entry entry : map1.entrySet()){
            System.out.print(entry.getKey()+"   "+entry.getValue()+"  ");
        }
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "apple");
        map.put(2, "banana");
        map.put(3, "orange");
        map.put(1, "kiwi");
        System.out.println();
        System.out.println("Original Map: " + map);

        // Sort the keys of the map in ascending order
        Map<Integer, String> sortedMap = new TreeMap<>(map);

        System.out.println("Question number 29  Sorted Map: based on key" + sortedMap);

        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1, "apple");
        map3.put(2, "banana");
        map3.put(3, "orange");
        map3.put(4, "kiwi");

        System.out.println("Original Map: " + map3);
        // Sort the values of the map in ascending order
        List<Map.Entry<Integer, String>> entries = new ArrayList<>(map3.entrySet());
        Collections.sort(entries, Comparator.comparing(Map.Entry::getValue));
        LinkedHashMap<Integer, String> sortedMap1 = new LinkedHashMap<>();
        for(Map.Entry<Integer,String> entry:entries){
            sortedMap1.put(entry.getKey(),entry.getValue());
        }
        System.out.println("Question number 30  Sorted Map: based on Value:" + sortedMap1);

        /*31.Write a program to insert elements into a Hashtable.
        32.Write a program to remove an element from a Hashtable based on a key.
        33.Write a program to retrieve an element from a Hashtable based on a key.
        34.Write a program to check if a key exists in a Hashtable.
        35.Write a program to check if a value exists in a Hashtable.
        36.Write a program to get the keys of a Hashtable.
        37.Write a program to get the values of a Hashtable.*/

        // Create a new Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Insert elements into the Hashtable
        hashtable.put(1, "apple");
        hashtable.put(2, "banana");
        hashtable.put(3, "orange");
        hashtable.put(4, "kiwi");

        System.out.println("Question number 31:  Hashtable:--- " + hashtable);
        hashtable.remove(1);
        System.out.println("Question number 32:  Hashtable: after deleting a key--- " + hashtable);
        hashtable.remove(2,"banana");
        System.out.println("Question number 33:  Hashtable: after deleting a value--- " + hashtable);
        hashtable.put(1, "apple");
        hashtable.put(2, "banana");
        boolean hasKey = hashtable.containsKey(1);
        boolean hasValue = hashtable.containsValue("banana");
        System.out.println("Question number 34 and 35 : hasKey and hasValue   "+ hasKey +"   "+hasValue);
        Set<Integer> keySetHashTable = hashtable.keySet();
        Collection<String> valueSetHash = hashtable.values();
        System.out.println("Question number 36 : KeySet"+ keySetHashTable);
        System.out.println("Question number 37 : ValueSet"+ valueSetHash);

        /*38.Write a program to find the size of a Hashtable.
        39.Write a program to check if a Hashtable is empty or not.
        40.Write a program to remove all elements from a Hashtable.
        41.Write a program to iterate over the entries of a Hashtable.
        42.Write a program to sort the keys of a Hashtable in ascending order.
        43.Write a program to sort the values of a Hashtable in ascending order*/

        int size = hashtable.size();
        boolean isHashEmpty = hashtable.isEmpty();
        System.out.println("Question number 38 --- 39---- Size and IsEmpty"+size+isHashEmpty);
        System.out.println("Question number 41");
        for(Map.Entry<Integer,String> entry: hashtable.entrySet()){
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
        Map<Integer,String> sortedHashTable = new TreeMap<>(hashtable);

        List<Map.Entry<Integer,String>> entryList = new ArrayList<>(hashtable.entrySet());
        Collections.sort(entryList,Comparator.comparing(Map.Entry::getValue));
        LinkedHashMap<Integer,String> newHash = new LinkedHashMap<>();

        for (Map.Entry<Integer,String> entry : entryList)
        {
            newHash.put(entry.getKey(),entry.getValue());
        }
        System.out.println("Question number 43 : Sorting based on the value"+ newHash);
        hashtable.clear();
        System.out.println("Question number 40 : removing all elements   --  " + hashtable );

        /*44.Write a program to find the frequency of each element in a collection (Set or List).
        45.Write a program to check if a collection (Set or List) contains duplicate elements.
        46.Write a program to find the common elements between two collections (Set or List).
        47.Write a program to remove duplicates from a collection (Set or List).
        48.Write a program to sort elements in a collection (Set or List) in ascending order.
        49.Write a program to reverse the order of elements in a collection (Set or
        List).
        50.Write a program to convert a collection (Set or List) to an array*/

        List<Integer> newList = new ArrayList<>();
        newList.add(1); newList.add(12); newList.add(13); newList.add(13); newList.add(12); newList.add(14);
        Map<Integer,Integer> frequencyMap = new LinkedHashMap<>();
        for(Integer e : newList){
            if(frequencyMap.containsKey(e)){
                frequencyMap.put(e,frequencyMap.get(e)+1);
            } else {
                frequencyMap.put(e,1);
            }
        }
        System.out.println("Question number 44: frequency of each element"+ frequencyMap);
        Map<Integer,Integer> checkMap = new LinkedHashMap<>();
        boolean flag =false;
        for(Integer e : newList){
            if(checkMap.containsKey(e)){
                flag = true;
                break;
            } else {
                checkMap.put(e,1);
            }
        }
        System.out.println("Question number 45 Is duplicate element present --"+flag);
        List<Integer> listOne = new ArrayList<>();
        listOne.add(1); listOne.add(2); listOne.add(3);
        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(2); listTwo.add(3); listTwo.add(5);

        listOne.retainAll(listTwo);
        System.out.println("Question number 46:  -- Common between two List :  "+listOne);
        Set<Integer> newSet = new HashSet<>(newList);
        System.out.println("Question number 47: removing the duplicates"+newSet);
        newList.sort(Integer::compareTo);
        System.out.println("Question number 48 : sorting list in ascending order"+ newList);

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original List: " + list);
        Collections.reverse(list);
        System.out.println("Question number 49:--- Reversed List: " + list);

        Integer[] intArray = list.toArray(new Integer[0]);
        System.out.println("Question number 50 ==== list to Array ---"+Arrays.toString(intArray));

    }
    }



