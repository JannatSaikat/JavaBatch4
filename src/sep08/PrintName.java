package sep08;

public class PrintName {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while(i <= 100) {
            sum = sum + i;
            System.out.println(sum);
            i++;
        }

        System.out.println(sum);
    }
}
