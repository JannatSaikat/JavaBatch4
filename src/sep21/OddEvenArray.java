package sep21;

//4, 5, 2, 7, 9, 23, 12, 43, 3, 3,3,1,2,1,23,23,23,2,32

public class OddEvenArray {

    public static void main(String[] args) {

        int[] a = {4, 5, 2, 7, 9, 23, 12, 43, -3, 3,3, 1,2,1,23,23,23,2,32};
        String[] b = {"rr", "rr", "ewe", "re"};

        for(int j = 0; j < a.length ; j++) {

            if(a[j]%10 == 3 ) {
                System.out.println(a[j]);
            }
        }
    }
}
