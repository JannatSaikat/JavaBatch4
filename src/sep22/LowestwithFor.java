package sep22;

public class LowestwithFor {

    public static void main(String[] args) {
        int[] numbers = {3, 65, 12, 100, 2 , 3, 5, 6, 12, 900 , 3, 56, 1, -60, 32, 3, 12};

        int lowest = 3;

        for(int i = 0 ; i  < numbers.length ; i++) {
            if(numbers[i] < lowest) {
               lowest =  numbers[i];
            }
        }
        System.out.println(lowest);
    }
}
