package sep07;

public class Grading {

    public static void main(String[] args) {
        // less than 40 F
        // 40-59  D
        // 60-79  C
        // 80/+ B

        int marks = 79;


            if(marks < 40) {
                System.out.println("F");
            }
            else if(marks >= 40 && marks <= 59) {
                System.out.println("D");
            }
            else if(marks >= 60 && marks <= 79) {
                System.out.println("C");
            }
            else if(marks >=80) {
                System.out.println("B");
            }
            else {
                System.out.println("Enter again");
            }
    }
}
