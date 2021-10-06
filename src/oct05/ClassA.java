package oct05;

public class ClassA {

    ClassA(){}

    public static void main(String[] args) {
        Methods obj1 = new Methods();
        obj1.firstMethod();

        ClassA obj2 = new ClassA();
        obj2.method2();
    }

    void method2(){
        System.out.println("Method from ClassA");
    }
}
