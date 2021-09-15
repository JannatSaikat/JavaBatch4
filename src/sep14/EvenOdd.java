package sep14;

public class EvenOdd {

    public static void main(String[] args) {

        //find all even numbers less than 100
        int a = 1;

        while ( a < 100){
            if(a%2 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}
