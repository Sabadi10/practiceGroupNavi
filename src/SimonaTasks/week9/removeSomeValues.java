package SimonaTasks.week9;

/*
3️⃣ **List_RemoveSomeValues**
Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc.
remove all values greater than 100.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class removeSomeValues {

    public static void main(String[] args) {
        // Test the method
        List<Integer> numbers = new ArrayList<>();
       numbers.addAll(Arrays.asList(10, 5, 90, 100, 200, 300, 1));

        System.out.println("Original List: " + numbers);

        removeValuesGreaterThan100(numbers);

        System.out.println("List after removing values greater than 100: " + numbers);
    }

    public static void removeValuesGreaterThan100(List<Integer> list) {
        list.removeIf(num -> num > 100);
        //removeIf() method is a built-in method of the List interface in java
    }











        }
