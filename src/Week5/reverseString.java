package Week5;
/*
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
For solving this task I used reverse method
 */
public class reverseString {
    public static void main(String[] args) {

        String name = "ABCD";
        String result = reverse(name);
        System.out.println(result);
    }

    public static String reverse(String str){
        String reverse = "";

        for(int i = str.length() - 1 ; i >= 0; i-- ){
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
