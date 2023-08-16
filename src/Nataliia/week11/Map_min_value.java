package Nataliia.week11;

import java.util.Map;

/*
Map - Min value
Write a method that can return the minimum value from ta map (DO NOT use sort method)
 */
public class Map_min_value {

    public static void map_minValue(Map<String, Integer> map) {

        if (map.isEmpty()) {
            throw new IllegalArgumentException("Map is empty");
        }

        Integer minValue = null;

        for (Integer value : map.values()) {
            if (minValue == null || value.compareTo(minValue) < 0) {
                minValue = value;
            }

        }
        System.out.println("minValue = " + minValue);
    }

    public static void main(String[] args) {
        // Example usage
        Map<String, Integer> map = Map.of("A", 5, "B", 24, "C", 38, "D", 11);
        map_minValue(map);
    }
}
