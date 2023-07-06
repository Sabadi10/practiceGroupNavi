package anna.week07;

public class findMax {
    public static int findMixElement(int[] arr){
        if(arr.length==0){
            throw new IllegalArgumentException("----- Empty array! -----");
        }
        int mix=arr[0];
        for(int each : arr){
            if(each<mix){
                mix=each;
            }
        }
        return mix;
    }

    public static void main(String[] args) {

        System.out.println(findMixElement( new int[]{1, 4, 8, -22}));
        System.out.println(findMixElement( new int[]{}));

    }
}
