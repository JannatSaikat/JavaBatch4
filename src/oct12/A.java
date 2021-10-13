package oct12;

public class A{

    int a = 100;

    void m1(){
        System.out.println("Method from A");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.m1();
        System.out.println(obj.a);
        B ob = new B();
        ob.m2();

    }
}
