package Week4;
/*
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
For solving this task I used for loop
 */

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AAABBBCCC";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }
        }
        System.out.println(result);
    }
}
