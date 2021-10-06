package oct05;

public class RunnerClass {

    public static void main(String[] args) {


        //nameOfTheClass reference/object = new Costructor;
        ReferenceClass ref = new ReferenceClass();
        ref.multiply();

        ClassA a1 = new ClassA();
        a1.method2();

        Class01 name = new Class01();
        name.method11();

        ClassRandom random = new ClassRandom();
        random.randomMethod();
        random.anotherRandom();
        System.out.println(random.a);

    }
}
