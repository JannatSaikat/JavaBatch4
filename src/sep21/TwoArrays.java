package sep21;

public class TwoArrays {


    //5, 2, 7, 9, 23
    // "A", "t", "ffr", "eed", "wea"
    public static void main(String[] args) {

        int[] a = {5, 2, 7, 9, 23};

        String[] b =  {"A", "t", "ffr", "eed", "wea"};

        //array[index];

        for(int i = 0; i < b.length ; i++) {

            System.out.println(a[i] + " " +  b[i]);

        }

    }
}
