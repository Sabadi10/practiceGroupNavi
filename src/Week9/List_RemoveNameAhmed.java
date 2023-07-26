package Week9;
import java.util.ArrayList;
import java.util.Arrays;

/*
Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
Write a java operation to remove all the names named Ahmed
 */
public class List_RemoveNameAhmed {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

            list.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron"));

            list.removeAll(Arrays.asList("Ahmed"));

            System.out.println(list);
        }
    }

