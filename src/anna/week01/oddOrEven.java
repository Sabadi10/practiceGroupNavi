package anna.week01;

public class oddOrEven {
    public static void identify (int num){
        if(num%2 == 0){
            System.out.println(num + " is even");
        } else if(num%2==1){
            System.out.println(num + " is odd");
        } else if(num==0){
            System.out.println("It's zero");
        }
    }
}
