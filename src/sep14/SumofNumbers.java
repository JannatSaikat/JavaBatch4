package sep14;

public class SumofNumbers {

    public static void main(String[] args) {

        //sum of -5 to 18

        int a  = -5;
        int sum = 0;

        while ( a < 18) {
            System.out.println( "number is: " + a);
            sum = sum + a;
            System.out.println( "sum is : " + sum);
            a++;
        }


    }
}
