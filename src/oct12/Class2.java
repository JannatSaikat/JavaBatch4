package oct12;

public class Class2 extends Class1{
    int a = 10;

    void m1(){
        System.out.println("m1 from 2");
    }

    void runner(){
        m1();  // own class method
        this.m1(); // own class method
        super.m1(); // parent class method

        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        Class2 ref = new Class2();
        ref.runner();
    }
}
