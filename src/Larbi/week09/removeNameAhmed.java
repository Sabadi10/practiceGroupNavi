package Larbi.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeNameAhmed {

    /*
        List_RemoveNameAhmed**
        - Given a list of people names: "Ahmed","John","Mohammed","Ahmed","Simon","Ahmed"
        - Write a java operation to remove all the names named Ahmed
     */

        public static void main(String[] args) {

            List<String> names =new ArrayList<>(Arrays.asList("Ahmed","John","Mohammed","Ahmed","Simon","Ahmed"));

            names.removeAll(List.of("Ahmed"));
            System.out.println(names);
        }


}
