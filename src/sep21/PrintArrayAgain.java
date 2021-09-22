package sep21;

public class PrintArrayAgain {

    public static void main(String[] args) {
        int[] a = {54, 5, 2, 7, 9, 23, 12, 43, 3, 3,3,1,2,1,23,23,23,2,32 , 4};
        int[] b = {54, 5, 2, 7};


        System.out.println(b[4]);


        //Starting point, comparison (End point), exit
        //1st approach 0 to a.length-1
        //2nd approach a.length-1 to 0
        //maximum index is number of elements -1

        for(int i = a.length -1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
