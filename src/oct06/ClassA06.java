package oct06;

public class ClassA06 {

    public static void main(String[] args) {
        ClassA06 n = new ClassA06();
        n.sum();
        n.sumWithParam( 60 , 5);
        n.sumWithParam( 7, 8);
        n.sumWithParam(12, 14);
        n.sumWithParam(843, 763);

    }

    void sum(){
        int a  = 6;
        int b = 5;
        System.out.println( a + b);
    }

    void sumWithParam(int a, int b){
        System.out.println(a + b);
    }

    void multiply(int a, int b, int c){
        System.out.println( a  * b * c);
    }
}
