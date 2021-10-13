package oct12;

import java.util.Scanner;

public class ScannerPrac {

    void name(){

        String a ;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name: ");
        a = sc.next();
        System.out.println("Input your id: ");
        b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        ScannerPrac ob = new ScannerPrac();
        ob.name();
    }
}
