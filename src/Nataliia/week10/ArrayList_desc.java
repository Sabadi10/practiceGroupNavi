package Nataliia.week10;

import java.util.ArrayList;

/*
ArrayList - sorting in descending order
Write a method that can sort the arrayList in Descending order without using sort method
 */
public class ArrayList_desc {

    public static void descSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) > list.get(maxIndex)) {
                    maxIndex = j;
                }
            }
            // Swap the elements at i and minIndex
            int temp = list.get(i);
            list.set(i, list.get(maxIndex));
            list.set(maxIndex, temp);
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(6);

        System.out.println("Original ArrayList: " + arrayList);
        descSort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);
    }
}
