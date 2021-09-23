package sep22;

public class LowestNumber {
    public static void main(String[] args) {

        int[] numbers = {3, 65, 12, 100, 2 , 3, 5, 6, 12, 900 , 3, 56, 1, -60, 32, 3, 12};

        int lowest = 3;

        for(int j : numbers) {
            if(j < lowest) {
                lowest = j;
            }
        }
        System.out.println(lowest);
    }
}
