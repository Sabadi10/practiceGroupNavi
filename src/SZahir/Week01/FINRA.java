package SZahir.Week01;

public class FINRA {


        public static void printNumbers(){
            for (int i = 1; i <=30 ; i++) {
                if(i % 3 ==0 && i %5 ==0){
                    System.out.println("FINRA"); // Finra
                } else if (i%3 ==0) {
                    System.out.println("FIN");

                } else if (i%5 ==0) {
                    System.out.println("RA");

                } else{
                    System.out.println(i);
                }

            }
        }

        public static void main(String[] args)
        {printNumbers();}
    }
