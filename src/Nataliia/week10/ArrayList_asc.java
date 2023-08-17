package Nataliia.week10;

import java.util.ArrayList;

/*
ArrayList - sorting in ascending order
Write a method that can sort the arrayList in Ascending order without using sort method
 */
public class ArrayList_asc {
//5,2,9,1,5
    public static void acsSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            // Swap the elements at i and minIndex
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
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
        acsSort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);
    }
}
