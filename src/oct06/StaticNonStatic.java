package oct06;

public class StaticNonStatic {


    void method1(){
        method2();
        method3();
        method4();
    }

    //non - static
    void method2(){
        method1();
        method3();
        method4();
    }

    //static
    static void method3(){
        method4();
//        method1(); //only through object
    }

    static void method4(){
        method3();
    }

}
