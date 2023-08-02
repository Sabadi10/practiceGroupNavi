package week10;
import java.util.ArrayList;
/*
  ArrayList - sorting in descending order
Write a method that can sort the ArrayList in Descending order without using the sort method.
 */

public class ArrayList_SortingDescending {
    public static void bubbleSortDescending(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    // Swap elements if they are in the wrong order
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(13);
        list.add(7);
        list.add(5);
        list.add(83);

        System.out.println("Giving ArrayList: " + list);

        // Sort the ArrayList in descending order
        bubbleSortDescending(list);

        System.out.println("Sorted ArrayList (Descending): " + list);
    }
}
