package oct06;

public class MultiplyClass {
    public static void main(String[] args) {
        MultiplyClass obj = new MultiplyClass();
        obj.multiply(754, 82);
        obj.multiply(2,8 , 3);
        obj.multiply(23, 12);
    }

    void multiply(int a, int b){
        System.out.println(a * b);
    }

    void multiply(int a, int b, int c){
        System.out.println(a * b * c);
    }

    void multiply(int a, int b, int c, int d){
        System.out.println(a * b * c * d);
    }

    void multiply(int v, int w, int x, int y, int z) {
        System.out.println(v * w * x * y *z);
    }
}
