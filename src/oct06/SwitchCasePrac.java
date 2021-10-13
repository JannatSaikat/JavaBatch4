package oct06;

import java.sql.SQLOutput;

public class SwitchCasePrac {

    public static void main(String[] args) {
        SwitchCasePrac ob = new SwitchCasePrac();
        ob.withIfElse();
        ob.withSwitchCase();
    }

    void withIfElse(){
        //Wed - 1; Thu - 2; Fri - 3, Sat - 4;
        String day = "Fri";

        if(day == "Wed") {
            System.out.println(1);
        } else if(day == "Thu") {
            System.out.println(2);
        } else if(day == "Fri") {
            System.out.println(3);
        } else if(day == "Sat") {
            System.out.println(4);
        } else {
            System.out.println(5);
        }
    }

    void withSwitchCase(){
        String day = "Fri";
        switch (day) {
            case "Wed":
                System.out.println(1);
                break;
            case "Thu":
                System.out.println(2);
                break;
            case "Fri":
                System.out.println(3);
                break;
            case "Sat":
                System.out.println(4);
                break;
            default:
                System.out.println(5);

        }
    }
}
