package anna.week06;
/*
🏆 **WEEK SIX  JAVA CODING TASKS** 🏆
**    2) String - sum of digits in a string**
Write a method that can return the sum of the digits in a string
 */
public class SameLetters {
    public static int SummOfDigits (String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>'0'&&str.charAt(i)<='9'){
                int e = str.charAt(i) - '0';
                sum = sum + e;
            }
        }
        return sum;
    }

}
