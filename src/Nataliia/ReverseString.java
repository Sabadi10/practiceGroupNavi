package Nataliia;

public class ReverseString {

    //write a return method that can reverse String
    //Ex: Reverse("ABCD")==>DCBA

    public static void reverseString(String str){
        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        reverseString("ABCD1234");
    }
}
