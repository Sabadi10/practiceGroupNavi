package Tasks;

import java.util.Arrays;

public class SameLetter {
    public static void main(String[] args) {
        //String -- Same letters
        //
        //Write a return method that checks if a string is built out of the same letters as another string.
        //        //Ex:  same("abc",  "cab"); -> true
        //        //same("abc",  "abb"); -> false


        String str  =  "1 8N";
        String str1 =  "A1TM 8N*A";

        System.out.println("isSame_Letter() = " + isSame_Letter(str,str1));
    }

    public static  boolean isSame_Letter(String str , String str1){

        Boolean isSameLetter = false;


        char[] CH = str.toCharArray();
        Arrays.sort(CH);
       // System.out.println("CH = " + Arrays.toString(CH));
        char[] CH2 =   str1.toCharArray();
        Arrays.sort(CH2);
       // System.out.println("CH2 = " + Arrays.toString(CH2));

        for (int i = 0; i < CH.length; i++) {

            if (CH.length == CH2.length){
                if (CH[i] == CH2[i]){
                    isSameLetter = true;
                }
                else {
                    isSameLetter = false;
                    break;
                }

            }else {
                isSameLetter = false;
                break;
            }

        }



        /*for (int i = 0; i < str.length(); i++) {
            char ch1= str.charAt(i);


            for (int j = 0; j < str1.length(); j++) {
                char ch2 = str1.charAt(j);
                if (ch1==ch2){

                }
            }

        }*/


        return isSameLetter;
    }
}
