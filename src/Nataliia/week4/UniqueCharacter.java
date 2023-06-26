package Nataliia.week4;

public class UniqueCharacter {
    /*String--unique characters
    Write a return method that can find the unique characters from the String
    Ex: "AAABBBCCCDEF" ===>"DEF"
     */

    public static String unique( String str){
        String unique = "";
        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);

            if(str.indexOf(each) == str.lastIndexOf(each)  ){
                unique += each;
            }

        }

        return unique;
    }

    public static void main(String[] args) {


        System.out.println(unique("AAABBBCCCDEF"));
    }
}
