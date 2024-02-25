import java.util.Arrays;
import java.util.Random;

public class InsertionSort { // First time attempt les gooo
    public static void main(String[] args){
        int size = 10;
        int[] A = new int[size];
        Random r = new Random();
        for (int i =0; i<A.length; i++){
            A[i] = r.nextInt(11);
        }
        System.out.println(Arrays.toString(A));
        SelectSort(A, A.length);
        System.out.println(Arrays.toString(A));
    }

    public static void SelectionSort(int[] A, int n){
        for (int j = 0; j < n-1; j++){

            System.out.println(Arrays.toString(A));
            int minIndex = 0;
            int min = 999;
            int temp = 0;
            // Find minimum element;
            for(int i = j; i < n; i++){
                if (A[i] < min){
                    min = A[i];
                    minIndex = i;
                }
            }
            // Swap minimum element with j;
            temp = A[minIndex];
            A[minIndex] = A[j];
            A[j] = temp;
        }
        System.out.println(Arrays.toString(A));
    }


    public static void SelectSort(int[] A, int n){
        for(int j = 0; j < n - 1; j++){
            int minIndex = 0;
            int min = 999;
            int temp = 0;
            for(int i = j; i < n; i++){
                if (A[i] < min){
                    min = A[i];
                    minIndex = i;
                }
            }
            temp = A[minIndex];
            A[minIndex] = A[j];
            A[j] = temp;
        }
    }
}
