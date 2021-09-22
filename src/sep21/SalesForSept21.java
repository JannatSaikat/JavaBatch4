package sep21;

import java.util.ArrayList;

public class SalesForSept21 {

    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<>();

        a.add(5.10);
        a.add(95.30);
        a.add(54.31);
        a.add(43.21);

        System.out.println(a);

        for(int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

    }
}
