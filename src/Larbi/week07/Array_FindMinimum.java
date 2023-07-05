package Larbi.week07;

import java.util.Arrays;
public class Array_FindMinimum {

    /*
        Write a method that can find the maximum number from an int Array
    */

    public static void main(String[] args) {
        int[] lar = {0,12,55,32,42,120,-52};
        System.out.println(minNumber(lar));

    }

    public static int minNumber(int[] lar){

        int max = lar[0];

        for (int i = 0; i < lar.length; i++) {
            if(lar[i]>max){
                max=lar[i];
            }
        }

        return max;
    }

}
