package Tasks;

public class FindUniqueChar {
    public static void main(String[] args) {
        //     //3.String -- Find the unique
        //        //Write a return  method that can find the unique characters from the String
        //        //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

        String text  = "aabbaachdew";
        System.out.println("The Unique character in <" + text + ">: " + UniqueChar(text));



    }
    public static String UniqueChar(String text){

        String result = "";
        int count = 0;

        if (!text.isEmpty()  || !text.isBlank()) {
            for (int i = 0; i < text.length(); i++) {
                char ch1 = text.charAt(i);
                count = 0;
                for (int j = 0; j < text.length(); j++) {
                    if (ch1 == text.charAt(j)) {
                        count++;
                    }
                }
                if (count > 1) {
                    continue;
                } else {
                    result += ch1;
                }

            }


        }else {
            result = "Invalid input";
        }

        return result;
    }
}
