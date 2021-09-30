package sep29;

public class WhileLoop {

    public static void main(String[] args) {


        //starting
        //logic check
        //ending


        // 65 to -35

        int a  = 65;
        int sum = 0;
        int count = 0;

        while(a>=-35) {
            sum = sum + a;
            count++;
            a--;

        }


        System.out.println(sum / count);
    }
}
