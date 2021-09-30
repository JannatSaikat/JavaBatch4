package sep29;

public class LowestHighest {

    public static void main(String[] args) {

        int[] a = {34, 23, 45, 76, 26, -43};
        int highest = a[0];

        for(int i = 0; i < a.length ; i++) {
            if(highest < a[i]) {
                highest = a[i];
            }
        }
        System.out.println(highest);

    }
}
