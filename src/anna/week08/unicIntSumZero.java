package anna.week08;
/*
2️⃣  Array_NuniqueIntegersThatSumUpTo
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).

 */
public class unicIntSumZero {
    public static int[] ArrayNuniqueIntegers(int num){
        int[] unic = new int[num];

        if(num%2!=0){
            for (int i = 0, j =  unic.length/2; i < (unic.length-1)/2; i++, j++) {
                unic[i]=i+1;
                unic[j]=-i-1;
            }
        }
        for (int i = 0, j =  unic.length/2; i < unic.length/2; i++, j++) {
            unic[i]=i+1;
            unic[j]=-i-1;
        }
        return unic;
    }
}
