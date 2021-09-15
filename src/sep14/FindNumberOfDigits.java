package sep14;

public class FindNumberOfDigits {

    public static void main(String[] args) {


        int a = 67687;
        int count = 1;

        while ( a > 10) {
            a = a / 10;
            count++;
        }

        System.out.println(count);
    }
}
