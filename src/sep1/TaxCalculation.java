package sep1;

public class TaxCalculation {

    // less than or equal 24,999 you pay 0 tax
    // 25000-99,999 you pay 10% tax
    // 100000 and above you pay 20% tax

    public static void main(String[] args){
        int earning = 155000;

    if(earning <= 24999) {
        System.out.println("You have to pay 0 tax");
    } else if(earning >= 25000 && earning <= 99999) {
        System.out.println("tax is 10%");
    } else if(earning > 100000) {
        System.out.println("you pay 20% tax");
    }


    }



}
