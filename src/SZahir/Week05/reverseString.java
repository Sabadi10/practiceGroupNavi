package SZahir.Week05;
/*
This is a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */
public class reverseString {
    public static String reversedString(String str){
        StringBuilder reversed=new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("reversedString(\"ABCD\") = " + reversedString("ABCD"));


    }
}
