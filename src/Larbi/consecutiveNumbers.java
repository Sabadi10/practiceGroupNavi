package Larbi;

public class consecutiveNumbers {

    public static void main(String[] args) {

        consNum(65);
    }
    public static void consNum(int N){

        for (int i = 1; i <= N; i++) {
            StringBuffer str = new StringBuffer();

            if(i%2==0){
                str.append("Codility");
            }
            if(i%3==0){
                str.append("Test");
            }
            if(i%5==0){
                str.append("Coders");
            }

            if (str.length() > 0) {
                System.out.println(str);
            } else {
                System.out.println(i);
            }

        }

    }

    /*
    numbers which are divisible by 2,3 or 5 print "Codility"
    number which can divisible by 2,3  print CodilityTest
    number which can divisible by 2,3 and 5 CodilityTestCoders
     */

}
