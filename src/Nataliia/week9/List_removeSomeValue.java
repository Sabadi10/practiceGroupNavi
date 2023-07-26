package Nataliia.week9;
/*
List_RemoveSomeValues
Given list of Integers 1,2,3,4,5,6,101,200,300...remove all values greater than 100
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_removeSomeValue {

    public static void remove_some_values(List<Integer> numbers, Integer value){
        //Collections.sort(numbers);
        numbers.removeIf(p->p > value);
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,101,200,300));
        remove_some_values(nums, 100);
    }

}
