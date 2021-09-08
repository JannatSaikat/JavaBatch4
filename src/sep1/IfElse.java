package sep1;

public class IfElse {
    //if yearly earning is less than $25000, you don't pay tax

    public static void main(String[] args) {
        int income = 1600;
        int cutOffIncome = 25000;


    if(income < cutOffIncome) {
        System.out.println("Your income is less than 25000 and you don't have t pay tax");
    } else {
        System.out.println("You have to pay tax");
    }

    }
}
