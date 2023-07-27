package Week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100
public class List_RemoveSomeValues {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));

        for (int each : list) {
            if (each <= 100) {
                System.out.println(each);
            }
        }
    }
}

