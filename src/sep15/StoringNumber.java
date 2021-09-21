package sep15;

public class StoringNumber {

    public static void main(String[] args) {

        //5 6
        //6 5
        //7 7
        //8 8
        //9 7

        // { 6 , 5 , 7 , 8 , 7 }

        int[] marks = { 6088 , 5453 , 74543 , 845 , 7345 };
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println("========================");

       for(int a = 0; a <= marks.length - 1; a++) {
            System.out.println(marks[a]);
        }
    }
}
