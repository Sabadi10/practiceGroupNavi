package anna.week09;

import java.util.ArrayList;
import java.util.Arrays;

public class removeName {
    public static void list_RemoveNameAhmed(ArrayList<String> arr1, String name) {
        arr1.removeIf(p->p.equalsIgnoreCase(name));
    }




}
