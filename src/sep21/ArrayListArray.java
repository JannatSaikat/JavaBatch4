package sep21;

import java.util.ArrayList;

public class ArrayListArray {

    //43, 3, 3, 3, 1, 2, 1, 23, 23

    public static void main(String[] args) {

        //We know how many numbers, and also know the numbers
        int[] numbers = {43, 3, 3, 3, 1, 2, 1, 23, 23};




       // We know how many numbers, and DO NOT know what are the numbers
        int[] numbers2 = new int[9];
        numbers2[0] = 43;
        numbers2[1] = 3;
        numbers2[2] = 3;
        numbers2[3] = 3;
        numbers2[4] = 1;
        numbers2[5] = 2;
        numbers2[6] = 1;
        numbers2[7] = 23;
        numbers2[8] = 23;

        //We DO NOT know how many numbers, and DO NOT know what are the numbers

        ArrayList<Integer> c = new ArrayList<>();
        c.add(0,5);
        c.add(1, 7);
        c.add(23);
        c.add(15);
        c.add(37);
        c.add(22);

        //length
        //Array
        System.out.println(numbers.length);
        //ArrayList
        System.out.println(c.size());

        //Array - Index in square bracket
        System.out.println(numbers[8]);
        System.out.println(numbers2[8]);
        //Arraylist .get(index)
        System.out.println(c.get(2));

        //Array - print everything --loop
        //Arraylist - print with loop or directly

        System.out.println(c);
    }
}
