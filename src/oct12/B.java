package oct12;

public class B extends A{
    int b = 200;

    void m2() {
        System.out.println("Method from m2");
    }

    public static void main(String[] args) {
       B obj = new B();

       obj.m1();
       obj.m2();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
