package oct05;

public class Methods {

    int a = 5;

    public static void main(String[] args) {
        Methods b = new Methods();
        b.firstMethod();

        System.out.println(b.a);
    }

    void firstMethod(){
        System.out.println("Another method from Methods class");
    }
}
