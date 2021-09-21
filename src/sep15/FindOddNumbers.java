package sep15;

public class FindOddNumbers {
    //Print odd numbers between 1 to 99
    // 1 ,3, 5, 7,9,11 - odd
    // 2, 4, 6, 8, 10, 12 - even


    //for(initialization ; logic ; increment/decrement)

    public static void main(String[] args) {


        for(int a = 1; a <= 99; a = a + 1) {

            if(a%2 ==0) {
                System.out.println(a);
            }
        }

    }
}
