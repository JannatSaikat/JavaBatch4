package oct12;

public class StaticNonStatic {

    static int a = 7;
    int b = 5;

    void name(String n){
        System.out.println(n);
    }

    void DOB(){
        System.out.println("**/**/****");
    }

    static void SSN(){
        System.out.println("***-**-****");
    }

    static void address(){
        System.out.println("South Richmond hill, NY");
    }

    void BankID(){  //Non Static
        name("Jay"); //Non Static
        DOB(); //Non Static
        SSN(); //Static
    }

    static void DrivingLicense(){
        StaticNonStatic ref = new StaticNonStatic();
        ref.name("Rajib");  //Non-Static to Static with Object
        ref.DOB();
        address();
    }

    public static void main(String[] args) {
        StaticNonStatic obj = new StaticNonStatic();
        obj.BankID();

        System.out.println(a);
        System.out.println(obj.b);

        DrivingLicense();
    }


}
