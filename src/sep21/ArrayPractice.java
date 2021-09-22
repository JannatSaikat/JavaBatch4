package sep21;

public class ArrayPractice {
    //4 5 2 7 9 23 12

    public static void main(String[] args) {
        int[] a  = {4, 5, 2, 7, 9, 23, 12, 43, 3, 3,3,1,2,1,23,23,23,2,32};


        int numbers = a.length;
        int num = 7;
        System.out.println(numbers);
        //a[0] //a[b]
        //a[1] //a[b]
        //a[2] //a[b]
        //a[3]
        for(int b = 0; b <= 6; b++) {
            System.out.println(a[b]);
        }



    }
}
