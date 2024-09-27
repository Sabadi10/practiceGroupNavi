package Tasks;

import java.util.ArrayList;
import java.util.List;

public class RemoveSomeValue {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        numbers.add(5);
        numbers.add(6);
        numbers.add(101);
        numbers.add(200);
        numbers.add(300);

        System.out.println("Original List: " + numbers);

        removeValuesGreaterThan100(numbers);

        System.out.println("List after removing values greater than 100: " + numbers);
    }

    public static void removeValuesGreaterThan100(List<Integer> numbers) {
        numbers.removeIf(number -> number > 100);
    }

}
