import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class bubbleSort {
    public static void main(String[] args){
        int length = 5;
        int[] A = new int[] {10,9,8,7,5};
//        Random r = new Random();
//        for (int i = 0; i < length; i++) {
//             A[i] = r.nextInt(11);
//        }
//        BubbleSort(A, A.length);
        Bubble(A, A.length);
        System.out.println(Arrays.toString(A));
    }

    public static void BubbleSort(int[] A,int n){
       boolean swapped = true;
       int temp = 0;
       int iterationCount = 0;
       while (swapped){
           iterationCount++;
           System.out.print(iterationCount + " n is ");
           System.out.print(n + " : ");
           System.out.println(Arrays.toString(A));
           swapped = false;
           for (int i = 0; i < n - 1; i++){
               if (A[i] > A[i+1]){
                   temp = A[i];
                   A[i] = A[i+1];
                   A[i+1] = temp;
                   swapped = true;
                   System.out.println(Arrays.toString(A));
               }
           }
           n = n - 1;
       }
    }

    public static void Bubble(int[] A, int n){
        boolean swap = true;
        int temp;
        while(swap){
            swap = false;
            for (int i = 0; i < n - 1; i++){
                if (A[i] > A[i+1]){
                    temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                    swap = true;
                }
            }
            n = n - 1;
        }
    }
}
