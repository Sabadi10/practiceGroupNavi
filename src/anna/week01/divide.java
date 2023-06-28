package anna.week01;

public class divide {
    public static void NDivide( int n1, int n2){
        int result = 0;
        int n = n1;
        while (n>=n2){
            n=n-n2;
            result++;
        }
        System.out.println(n1 + " divide on " + n2 + " is " + result);
    }
}

