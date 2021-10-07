package oct06;

public class SumClass {

    public static void main(String[] args) {

        SumClass ref = new SumClass();
        ref.sum(4, 6);
        ref.sum(4, 6, 2, 32, 54);
        ref.sum(33, 22, 47);
        ref.sum(12, 34, 53, 13, 19);
        ref.sum(34, 56);
        ref.sum(85, 65);

    }


    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
    void sum(int a, int b, int c, int d, int e){
        System.out.println(a+b+c+d+e);
    }
}
