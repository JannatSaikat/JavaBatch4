package sep22;

public class ArrayPractice {

    public static void main(String[] args) {

        // int[] a = {3, 5, 9};

        int[] a = new int[5];
        a[0] = 3;
        a[1] = 5;
        a[2] = 9;
        a[3] = 10;
        a[4] = 23;

        //find out size
        System.out.println(a.length);


        //print all elements for loop
        for(int i = 2; i<= 3; i++) {
            System.out.println(a[i]);
        }

        //print all elements for loop
        for(int i = 0; i<= a.length -1; i++) {
            System.out.println(a[i]);
        }



        //advanced for loop // foreach loop
        for(int j : a) {
            System.out.println(j);
        }

    }
}
