package anna.week09;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSomeValues {
    public static void list_RemoveNameAhmed(ArrayList<Integer> arr1, int num) {
        arr1.removeIf(p->p>100);
    }
}
