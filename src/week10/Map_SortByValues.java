package week10;
import java.util.*;
/*
 Map - Sort the map by values
Write a method that can sort the Map by values.
 */
public class Map_SortByValues {

    public static Map<String, Integer> sortMapByValuesAscending(Map<String, Integer> unsortedMap) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(unsortedMap.entrySet());

        list.sort(Map.Entry.comparingByValue());

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Zafer", 30);
        unsortedMap.put("Giray", 31);
        unsortedMap.put("Ersin", 29);
        unsortedMap.put("Sophia", 26);

        System.out.println("Unsorted Map: " + unsortedMap);

        Map<String, Integer> sortedMap = sortMapByValuesAscending(unsortedMap);

        System.out.println("Sorted Map (Ascending): " + sortedMap);

    }
}
