package sep29;

import java.util.ArrayList;

public class ArrayListRefresher {

    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();

        countries.add("Bangladesh");
        countries.add("India");
        countries.add("Pakistan");
        countries.add("China");
        countries.add("Hong Kong");

        System.out.println(countries.contains("Singapore"));
        System.out.println(countries.size());
        System.out.println(countries.isEmpty());
        //for loop
        for(int i = 0; i < countries.size() ; i++) {
            System.out.println(countries.get(i));
        }

        //advanced for loop

        for(String a : countries) {
            System.out.println(a);
        }
    }
}
