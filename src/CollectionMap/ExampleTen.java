package CollectionMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExampleTen
{
    public static void main(String[] args)
    {/*
        How do you retrieve all key-value pairs present in a HashMap?

            entrySet() method returns all key-value pairs present in a HashMap in the form of Set.*/
        //Creating the HashMap

        HashMap<String, String> map = new HashMap<String, String>();

        //Adding key-value pairs to HashMap

        map.put("ONE", "AAA");

        map.put("TWO", "BBB");

        map.put("THREE", "CCC");

        map.put("FOUR", "DDD");

        map.put("FIVE", "EEE");

        //Retrieving the Set consists of all key-value pairs in map

        Set<Entry<String, String>> keyValueSet = map.entrySet();

        for (Entry<String, String> entry : keyValueSet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //Removing the entry set while iterating the map
        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry current = (Entry) itr.next();
            if(current.getKey().equals("FIVE")){
                itr.remove();
            }
        }
    }
}
