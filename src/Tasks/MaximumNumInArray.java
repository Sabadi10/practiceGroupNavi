package Tasks;

public class MaximumNumInArray {
    public static void main(String[] args) {

        int[] array = {5, 8, 4, 6, 8, 1, 2, 8, 6, 12};
        System.out.println(MaximumNum(array));

    }
    public static int MaximumNum(int array[]){
        int MaxNum = -2147483647;
        for (int each : array) {
            if (each > MaxNum) {
                MaxNum = each;
            }
        }

        return MaxNum;
    }
}
