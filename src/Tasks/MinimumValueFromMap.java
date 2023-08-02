package Tasks;

import java.util.Map;

public class MinimumValueFromMap {
    // Map - Min value
    //Write a method that can return the minimum value from ta map (DO NOT use sort method)
    public static <K, V> V getMinimumValue(Map<K, V> map) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Map is null or empty");
        }

        V minValue = null;

        // Iterate through the Map entries and find the minimum value
        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            if (minValue == null || compareValues(value, minValue) < 0) {
                minValue = value;
            }
        }

        return minValue;
    }

    // Custom comparison logic (if the values are integers)
    private static int compareValues(Object value1, Object value2) {
        if (value1 instanceof Integer && value2 instanceof Integer) {
            Integer int1 = (Integer) value1;
            Integer int2 = (Integer) value2;
            return Integer.compare(int1, int2);
        }

        // Add additional custom comparison logic for other types if needed

        throw new IllegalArgumentException("Unsupported value types for comparison");
    }

    public static void main(String[] args) {
        // Example usage:
        Map<String, Integer> sampleMap = Map.of("A", 5, "B", 2, "C", 8, "D", 3);

        int minimumValue = getMinimumValue(sampleMap);
        System.out.println("Minimum Value: " + minimumValue);
    }
}
