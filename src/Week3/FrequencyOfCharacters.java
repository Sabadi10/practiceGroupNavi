package Week3;
/*
Write a return method that can find the frequency of characters. Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2.
It's means - how many time we have each elements in given line
 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String arg="AAABBCDD";
        System.out.println("frequency(arg) = " + frequency(arg));
    }
    public static String frequency(String word) {
        String result = "";
        for (int i = 0; i <word.length(); i++) {
            int count = 0;
            for (int j = 0; j <word.length(); j++) {
                if (word.charAt(i) == word.charAt(j))
                    count++;
            }
            if (result.contains(""+word.charAt(i))) {
                continue;}

            result += word.charAt(i) + "" + count + "";
        }
        return result;
    }
}


