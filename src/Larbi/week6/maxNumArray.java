package Larbi.week6;

public class maxNumArray {

//    Array - Find Maximum
//    Write a method that can find the maximum number from an int Array.

    public static void main(String[] args) {

        int [] a = null;

        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }

        }
        System.out.println(max);


    }


}
