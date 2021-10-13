package oct12;

public class CastingPrac {

    public static void main(String[] args) throws InterruptedException {
        int a = 15;
        double b = a;

        System.out.println(a);
        System.out.println(b);

        double c = 15.87;
        int d = (int) c;
        Thread.sleep(5000);
        System.out.println(c);
        System.out.println(d);


    }
}
