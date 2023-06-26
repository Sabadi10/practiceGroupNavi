package Larbi.week6;

public class maxNumArray {

    public static void main(String[] args) {

        int [] a = {1,11,3,8,5,6};
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }

        }
        System.out.println(max);

    }


}
