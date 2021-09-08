package Aug31;

import java.util.ArrayList;

public class ProblemSolving {

//    Fibonacci sequence: 0 1 1 2 3 5 8 13 21
//    fibonacci function(n) = fibonacci(n-1)+fibonacci(n-2)
//
//    Excercise: write a function that takes an argument X and prints the number of numbers in fibonacci
//    that are less than X
//
//    calling function(22) prints 9 (because 9 are less than 22: [0 1 1 2 3 5 8 13 21])
//    calling function(10) prints 7 (because 7 are less than 10: [0 1 1 2 3 5 8])
//    calling function(5) prints 5 (because 5 are less than 5: [0 1 1 2 3])
//    calling function(1) prints 1
//    calling function(0) prints 0

    static int findSize(int X) {

        int b = 1;

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int a =0; a <= X ; a++) {
           int c = a + b;
           b=c;
           a=b;
            if(c < X) {
                break;
            }
           numbers.add(c);

        }
        return numbers.size() + 2;
    }

    public static void main(String[] args) {
        System.out.println(findSize(8));
    }


}
