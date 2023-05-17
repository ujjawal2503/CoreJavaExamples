package CollectionMap;



import java.util.HashMap;

public class ExampleFive
{
    public static void main(String[] args)
    {
        /*How do you check whether a particular key/value exist in a HashMap?

            Using containsKey() and containsValue() methods.*/

        //Creating the HashMap

        HashMap<Integer, Double> map = new HashMap<Integer, Double>();

        //Adding key-value pairs to HashMap

        map.put(1, 1.1);

        map.put(2, 2.2);

        map.put(3, 3.3);

        map.put(4, 4.4);

        //Checking whether key '3' exist in map

        System.out.println(map.containsKey(3));      //Output : true

        //Checking whether value '3.3' exist in map

        System.out.println(map.containsValue(3.3));   //Output : true
    }
}
