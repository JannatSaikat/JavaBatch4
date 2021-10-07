package oct06;

public class Calculator {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.userDetailsPrint("john", "11/01/1985", 35, "Boston", 2345.85);
        obj.userDetailsPrint("Ben", "06/12/1978", 43, "Boston", 63748.54);

        obj.sumOfTwo(7843289, 3483984);
        obj.sumOfThree(76, 87, 8767);


    }

    void sumOfTwo(int i, int j){
        System.out.println( i + j);
    }

    void sumOfThree(int g, int h, int i) {
        System.out.println(g + h + i);
    }



    void userDetailsPrint(String name, String DoB, int age, String address, double balance) {
        System.out.println(name);
        System.out.println(DoB);
        System.out.println(age);
        System.out.println(address);
        System.out.println(balance);
    }

}
