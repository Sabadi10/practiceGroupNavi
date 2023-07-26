package SimonaTasks.week9;

/*
List_RemoveNameAhmed
Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
Write a java operation to remove all the names named Ahmed

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nameRemover {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","Natalia","Atman","Ahmed","Shaney","Raphael"));

        System.out.println("Original List: " + names);

        removeName(names, "Ahmed");

        System.out.println("List after removing Ahmed: " + names);
    }

    public static void removeName(List<String> names, String nameToRemove) {
        names.removeIf(name -> name.equals(nameToRemove));
    }


}
