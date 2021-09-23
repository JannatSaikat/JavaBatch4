package sep22;

public class ArrayLoopAdvancedloop {

    public static void main(String[] args) {

        String[] a = {"NY", "MA", "MD", "NJ", "PA", "CT"};

        //starting point, //ending point // increment/decremnet
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("=======================");

        //advanced for loop
        for(String i: a) {
            System.out.println(i);
        }
    }
}
