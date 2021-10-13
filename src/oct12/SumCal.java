package oct12;

import java.util.Scanner;

public class SumCal {

    void sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = scanner.nextInt();
        System.out.println("Input second number: ");
        int b = scanner.nextInt();

        System.out.print("The sum is: ");
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        SumCal sum = new SumCal();
        sum.sum();
    }
}
