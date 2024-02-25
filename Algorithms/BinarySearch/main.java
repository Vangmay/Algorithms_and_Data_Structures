public class main {

    public static void main(String[] args){
        int[] searchArray = new int[] {1,2,3,4,5,6,7,8,9,10};

        System.out.println(binarySearchh(searchArray, 5, 10));
        System.out.println(peakyFinder(searchArray));
    }

    public static int binarySearch(int[] A, int key, int n){
        int begin = 0;
        int end = n - 1;
        int mid = 0;
        while(begin < end){
            mid = (begin + end)  /2;
            if (key <= A[mid]){
                end = mid;
            }else{
                begin = mid + 1;
            }
        }
        return A[begin] == key ? begin : -1;
    }

    public static int binarySearchh(int A[], int key, int n){
        int begin = 0;
        int end = n - 1;
        int mid;
        while(begin < end){
            mid = (begin + end ) /2;
            if (key <= A[mid]){
                end = mid;
            } else {
                begin = mid + 1;
            }
        }

        return A[begin] == key ? begin : -1;
    }

     public static int peakFinder(int[] A){
        int being = 0;
        int end = A.length - 1;
        int mid = 0;

        while(being < end){
            mid = (being + end) /2;
            if (A[mid + 1] > A[mid]){ // Element to the right is greater
                being = mid + 1;
            }else{
                end = mid;
            }
        }

        return A[being];
     }

     public static int peakyFinder(int[] A){
        int begin = 0;
        int end = A.length - 1;
        int mid = 0;
        while(begin < end){
            mid = (begin + end) / 2;
            if(A[mid + 1] > A[mid]){ // recurse on right
                begin = mid + 1;
            }else{
                end = mid;
            }
        }
        return A[begin];
     }
}
