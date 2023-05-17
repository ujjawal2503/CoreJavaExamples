package CollectionMap;

import java.util.HashMap;
import java.util.Set;

public class ExampleEight
{
    public static void main(String[] args)
    {
        /*How do you retrieve all keys present in a HashMap?

        keySet() method returns all keys present in a HashMap in the form of Set.*/

        //Creating the HashMap

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //Adding key-value pairs to HashMap

        map.put(1, "AAA");

        map.put(2, "BBB");

        map.put(3, "CCC");

        map.put(4, "DDD");

        map.put(5, "EEE");

        //Retrieving the Key Set

        Set<Integer> keySet = map.keySet();

        for (Integer key : keySet)
        {
            System.out.println(key);
        }
    }
}
