package sep22;

public class LargestNumber {

    public static void main(String[] args) {

        int[] a = {100, 2 , 3, 5, 6, 12, 900 , 3, 56, 32, 3, 12};


        //find the largest number
        int largest = 100;

        for(int i = 0 ; i < a.length ; i++) {
            if(a[i] > largest)  {
                largest = a[i];
            }
        }

        System.out.println(largest);

    }
}
