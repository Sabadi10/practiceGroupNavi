package anna.week05;

public class ReverseString {
    /*
   This a return method that can reverse String
    */
    public static void reverseString(String word){
        String reverse="";

        for(int i =word.length()-1; i>=0; i--){
            reverse +=word.charAt(i);

        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        reverseString("1a232");
    }

}
