package oct06;

public class SumClass2 {

    public static void main(String[] args) {
//        multiply(); -- We need object
        sum(23, 43);
    }

    static void sum(int a, int b) {
        System.out.println(a + b);
    }


    void multiply(){
        sum(3, 4);
    }

    void modulas1(){
        multiply();
    }
}
