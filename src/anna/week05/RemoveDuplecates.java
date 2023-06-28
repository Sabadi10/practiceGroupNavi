package anna.week05;
/*
String -- Remove Duplicates

Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
 */
public class RemoveDuplecates {
    public static String removeDulpication(String str) {

    String result = "";
    for(
    int i = 0; i<str.length(); i++)

    {
        if (!result.contains(String.valueOf(str.charAt(i)))) {
            result += String.valueOf(str.charAt(i));
        }
    }
    return result;
}

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
