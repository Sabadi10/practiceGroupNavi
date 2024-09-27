package Tasks;

import java.util.ArrayList;
import java.util.List;

public class removeName {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");
        names.add("Aaron");

        System.out.println("Original List: " + names);

        removeName(names, "Ahmed");

        System.out.println("List after removing Ahmed: " + names);
    }

    public static void removeName(List<String> names, String nameToRemove) {
        names.removeIf(name -> name.equalsIgnoreCase(nameToRemove));
    }
}

