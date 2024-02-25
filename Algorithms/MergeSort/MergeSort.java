import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args){
        int size = 10;
        int[] A = new int[size];
        int[] B = new int[size];
        Random r = new Random();
        int num;
        for (int i =0; i<A.length; i++){
            num = r.nextInt(11);
            A[i] = num;
            B[i] = num;
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(MergeSort(A, A.length)));

    }
    public static int[] merge(int[] A, int[] B){
        int i = 0;
        int j = 0;
        int[] newArr = new int[A.length + B.length];
        int k = 0; // Current newArr's index;
        while(i < A.length && j < B.length){
            if (A[i] <= B[j]){
                newArr[k++] = A[i++];
            }else{
                newArr[k++] = B[j++];
            }
        }
        while(i < A.length){
            newArr[k++] = A[i++];
        }
        while(j < B.length){
            newArr[k++] = B[j++];
        }
        return newArr;
    };
    public static int[] MergeSort(int[] A, int n){
        System.out.println(A.length);
        if (n == 1){ return A;}
        else{
            int mid = A.length / 2;

            int[] leftSide = Arrays.copyOfRange(A, 0, mid); // All the elements till mid + 1
            int[] rightSide = Arrays.copyOfRange(A, mid , A.length); // Elements from mid+1 till A.length - 1



            System.out.println("LeftSide : " +  Arrays.toString(leftSide));
            System.out.println("RightSide: " + Arrays.toString(rightSide));

            int[] X = MergeSort(leftSide, leftSide.length);
            int[] Y = MergeSort(rightSide, rightSide.length);
            return merge(X, Y);
        }
    }




}
