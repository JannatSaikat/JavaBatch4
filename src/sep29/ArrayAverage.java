package sep29;

public class ArrayAverage {

    public static void main(String[] args) {

        int[] a = {34, 23, 45, 76, 26, -43};
        int sum = 0;

        for(int i : a) {
            sum = sum + i;
        }

        System.out.println(sum/a.length);
    }
}
