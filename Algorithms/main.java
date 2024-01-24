public class main {

    public static void main(String[] args){
        int[] myarr = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(myarr, 2, myarr.length));
    }
    public static int search (int [] A, int key, int n){
        int begin = 0;
        int end = n - 1;

        while (begin < end){
            if (key <= A[(begin + end) / 2]){
                end = (begin + end) / 2;
            }else{
                begin = 1 + ((begin + end) / 2);
            }

        }
        return (A[begin] == key) ? begin : - 1;
    };

}
