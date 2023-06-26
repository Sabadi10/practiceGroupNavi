package Nataliia;

public class FrequencyOFCharacter {

    //write a return method that can find the frequency of characters
    //ex: FrequencyOfChars("AAABBCDD") ==>A3B2C1D2

    public static void main(String[] args) {

        String str = "AAABBCDD";
        System.out.println(frequency(str));

    }

    public static String frequency(String word){
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(i) == word.charAt(j))
                    count++;
            }
            if(result.contains(""+word.charAt(i))){
                continue;
            }
            result += word.charAt(i) + "" +count + "";
        }
        return result;
    }



}
