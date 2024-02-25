import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args){
        Random r = new Random();
        int length= 9;
        int[] randomArray = new int[length];
        randomArray = new int[] {22, 1, 6, 40, 32, 10, 18, 50, 4};
        quickSort(randomArray, randomArray.length, 0, randomArray.length);
        System.out.println(Arrays.toString(randomArray));
        }

    public static void quickSort(int[] A, int n, int low, int high) {
        if ((high - low) <= 1){
            return;
        } else {
            int pi = partitionInplace(A, A.length, low);

            quickSort(A, pi - 1 - low, low, pi - 1);
            quickSort(A, high - pi+ 1 , pi + 1, high);
        }
    }
    public static int[] partition(int[] A, int n, int pivot){
        int[] B = new int[n];
        int low = 0;
        int high = n - 1;
        for(int i = 0; i <= n-1; i++){
            if (A[i] < pivot) {
                B[low] = A[i];
                low++;
            } else if (A[i] > pivot){
                B[high] = A[i];
                high--;
            }
        }
        B[low] = pivot;
        return B;
    }
    public static int partitionInplace(int[] A, int n, int pIndex){
        int pivot = A[pIndex];
        A[pIndex] = A[0];
        A[0] = pivot;

        int low = 1;
        int high = n -1  ;

        while(low < high){
            while (low < high && A[low] <= pivot) low++;
            while (low < high && A[high] > pivot) high--;
            if (low < high){
                int temp = A[high];
                A[high] = A[low];
                A[low] = temp;
            }
        }
        int temp = A[low-1];
        A[low-1] = A[0];
        A[0] = temp;
        return low - 1;
    }

}
