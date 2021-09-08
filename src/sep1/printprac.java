package sep1;

import java.util.Scanner;

public class printprac {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input b");
        int b = scan.nextInt();

        int a = scan.nextInt();

        System.out.println(a > b);
        System.out.println(a + b);
        System.out.println( a / b);
        System.out.println( a % b);
    }
}
