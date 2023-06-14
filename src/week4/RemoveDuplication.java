package week4;

public class RemoveDuplication {
    public static String removeDuplication(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(String.valueOf(str.charAt(i)))) {
                result += String.valueOf(str.charAt(i));
            }
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println(removeDuplication("aaaccvbdbdb"));
    }
}
/*
String -- Remove Duplicates


        Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC


 */

