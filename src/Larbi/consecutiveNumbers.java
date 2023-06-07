package Larbi;

public class consecutiveNumbers {

    public static void main(String[] args) {

        codilityTask(65);
    }

    public static void codilityTask(int N) {

        for (int i = 1; i <= N; i++) {

            StringBuffer lar = new StringBuffer();

                if(i%2==0){
                    lar.append("Codility");
                }
                if(i%3==0){
                    lar.append("Test");
                }
                if(i%5==0){
                    lar.append("Coders");
                }


            if (lar.length() > 0) {
                System.out.println(lar);
            } else
                {
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

