package sep21;

//4, 5, 2, 7, 9, 23, 12, 43, 3, 3,3,1,2,1,23,23,23,2,32

public class ArraySum {

    public static void main(String[] args) {
        int[] a = {4, 5, 2, 7, 9, 23, 12, 43, 3, 3,3,1,2,1,23,23,23,2,32};
        int[] x = new int[6];
        int sum = 0;




        for(int i = 0; i < a.length ; i++ ) {
            sum = sum + a[i];
        }

        System.out.println(sum);
    }


}
