package emirQuestions4;

/*
String -- Find the unique
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF"
 */

public class String_FindUnique {

    public static void main(String[] args) {

        uniqueCharacters("AASDDDRBBBV");

    }


    public static void uniqueCharacters(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            if (str.indexOf(current) == str.lastIndexOf(current)) {
                result += (current);
            }
        }
        System.out.println(result);

    }

}
