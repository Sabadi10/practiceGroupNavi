package Larbi.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeSomeValues {
    /*
            List_RemoveSomeValues
        Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100
     */

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));

        for (int each : nums) {
            if(each <= 100){
                System.out.println(each);
            }
        }

    }


}
