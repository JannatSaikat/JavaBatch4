package sep14;

public class SumEvenNumbers {

    // 2 to 100
    // sum of them

    public static void main(String[] args) {
        int a  = 2;
        int b  = 0;

        while ( a  <= 100) {
            b = b + a;
            a = a + 2;
        }

        System.out.println(b);
    }
}
