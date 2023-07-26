package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
  List_RemoveNameAhmed
Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
Write a java operation to remove all the names named Ahmed
 */
public class List_RemoveNameAhmed {


    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","Jhon","Eric","Ahmed","Aaron"));

        System.out.println("Original list: " + names);

        // Remove all occurrences of "Ahmed"
        names.removeIf(name -> name.equals("Ahmed"));

        System.out.println("List after removing Ahmed: " + names);
    }
}

