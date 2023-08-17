package Nataliia.week9;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
Map - sort the map by value
Write a method that can sort the Map by values.
assume the values are Integer that should be sorted smallest to largest

        Ex:
            input:
                sortByValue( {b=1, a=4, n=2, z=0, p=3, l=1, e=2, i=1} )
            output:
                [z=0, b=1, i=1, l=1, e=2, n=2, p=3, a=4]
 */
public class Map_sort_by_value {

    public static Map<String, Integer> sortByValue(Map<String,Integer> map){

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        for(int i = 0; i < entries.size(); i++){
            for(int j = 0; j < entries.size() -1; j++){
                if(entries.get(j).getValue() > entries.get(j + 1).getValue()){
                    Map.Entry<String, Integer> temp = entries.get(j);
                    entries.set(j, entries.get(j+1));
                    entries.set(j+1, temp);
                }
            }
        }

        Map<String, Integer> sorted = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> each : entries){
            sorted.put(each.getKey(), each.getValue());
        }

        return sorted;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("b", 1, "a", 4, "n", 2, "z", 0, "p", 3, "l", 1, "e", 2, "i", 1);
        System.out.println("Original " + map);
        System.out.println("Sorted " + sortByValue(map));
    }


}
