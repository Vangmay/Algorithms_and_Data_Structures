import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args){
//        int length = 10;
//        int i = 0;
//        int[] A = new int[length];
//        Random r = new Random();
//        for(i  = 0; i< length; i++){
//            A[i] = r.nextInt(11);
//        }
//
//        InsertionSort(A, length);
        int[] A = new int[] {9,3,12,4,12,421,31,56};
        InsertSort(A, A.length);
    }

    public static void InsertionSort(int[] A, int n){
        int key;
        int i;
        for(int j = 0; j < n ;j++){
            key = A[j];
            i = j - 1;
            while(i >= 0 && A[i] > key){
                A[i+1] = A[i];
                i--;
            }
            A[i+1] = key;
        }
        System.out.println(Arrays.toString(A));
    }

    public static void InsertSort(int[] A, int n){
        int key;
        int i;
        for(int j = 1; j < n; j++){
            key = A[j];
            i = j - 1;
            while(i >= 0 && A[i] >= key){
                A[i+1] = A[i];
                i--;
            }
            A[i+1] = key;
        }
        System.out.println(Arrays.toString(A));
    }
}
