package oct12;

public class C extends B {

    int c = 300;

    void m3(){
        System.out.println("Method from C");
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
