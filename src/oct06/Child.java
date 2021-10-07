package oct06;

public class Child extends Parent{

    String a  = "5";
    int b  =  10;
    int c = 15;

    public static void main(String[] args) {
        int d  = 56;
        Child obj = new Child();
        System.out.println(obj.c);
        System.out.println(obj.z);
        System.out.println(obj.y);

    }



}
