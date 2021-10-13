package oct12;

public class ParamPrac {

    void name(String a){
        System.out.println(a);
    }

    void id(int i){
        System.out.println(i);
    }

    void address(String b){
        System.out.println(b);
    }

    void id(String a, int a11, String c){
        name(a);
        id(a11);
        address(c);
    }

    public static void main(String[] args) {

        ParamPrac obj = new ParamPrac();
        obj.id("Safa", 2, "MA");
    }
}
