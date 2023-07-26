package SimonaTasks.removeDuplicates;

//String -- Remove Duplicates
//Write a return method that can remove the duplicated values from String
//Ex:  removeDup("AAABBBCCC")  ==> ABC

public class removeDuplicates {

    public static void main(String[] args) {

        removeDuplicates("AAABBBCCC");
    }


    public static void removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++){

            char each = str.charAt(i); // each character of the String str

            if (!result.contains("" + each)){
                result += each;
            }
        }

        System.out.println(result);

    }

}
