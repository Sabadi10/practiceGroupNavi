package Nataliia.week9;

import java.util.ArrayList;
import java.util.Arrays;

/*
List_RemoveNmeAhmed
Given  list of people : "Ahmet", "John", "Eric", "Ahmet", "Aaron"
Write  java operation to remove all the names named "Ahmet"
 */
public class List_removeAhmed {

    public static void list_remove_name_Ahmed(ArrayList<String> list, String name){

        list.removeIf(p->p.equals(name));

        System.out.println(list);

    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed","Aaron"));
        list_remove_name_Ahmed(names, "Ahmed");
    }
}
