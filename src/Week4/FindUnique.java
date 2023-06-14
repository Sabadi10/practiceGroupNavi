package Week4;
/*
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF"
For solving this task I used indexOf() and lastIndexOf() - if the first and last index numbers of the character are same, then it's unique char
 */
public class FindUnique {

    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }
        }
        System.out.println(unique);
    }
}




