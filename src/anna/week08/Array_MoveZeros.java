package anna.week08;
/*
Array_MoveZerosToTheEnd
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
public class Array_MoveZeros {
    public static int[] ArrayZerosToTheEnd (int[] arr){

        int next = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[next]=arr[i];
                next++;

            }
        }
        for (int i = next; i < arr.length; i++) {
            arr[i]=0;
        }
        return arr;
    }
}
