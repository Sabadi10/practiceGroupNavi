package Week101;
// Write a method that can return the minimum value from the map (DO NOT use sort method)

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapMinValue {

    public static void main(String args[]) throws Exception
    {
        // Creating hashMap
        Map<String, Integer> map = new HashMap<String, Integer>();

        // Putting key-value pairs in map
        map.put("A", 10);
        map.put("B", 15);
        map.put("C", 20);
        map.put("D", 25);

        // Print the map
        System.out.println("Map: " + map);

        // getting minimum value using min()
        int minValue = Collections.min(map.values());

        System.out.println("Minimum Value of Map is: " + minValue);

    }
}
