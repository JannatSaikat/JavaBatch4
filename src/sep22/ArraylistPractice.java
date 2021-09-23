package sep22;

import java.util.ArrayList;

public class ArraylistPractice {
    public static void main(String[] args) {

        //1 2 3 4 5

        //1 2 4 5

        int[] x = {2 , 3, 4, 7, 0};

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //add elements to ArrayList {1, 2 , 3, 5, 6, 12, 9}
        //2
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);

        //how to find size
        int i = numbers.size();
        //print size of ArrayList
        System.out.println("The size of the ArrayList is: " + numbers.size());
        //to find if the ArrayList is empty
        System.out.println("If the ArrayList is empty: " + numbers.isEmpty());
        // add in specific position
        numbers.add(1, 2);
        numbers.add(0, 1);
        numbers.add(5, 12);
        numbers.add(4, 25);
        //print specific index
        //name.get(index);
        System.out.println( "index 0 is: " + numbers.get(0));
        // check if 25 is there
        System.out.println("checking if 25 is there: " + numbers.contains(25));
        //print directly
        System.out.println(numbers);

        //print arraylist with for loop
        System.out.println("Print ArrayList with for loop");
        for(int j = 0; j < numbers.size(); j++) {
            System.out.println(numbers.get(j));
        }

        // index of a specific number
        System.out.println( "index of 12 is: " + numbers.indexOf(12));



    }
}
